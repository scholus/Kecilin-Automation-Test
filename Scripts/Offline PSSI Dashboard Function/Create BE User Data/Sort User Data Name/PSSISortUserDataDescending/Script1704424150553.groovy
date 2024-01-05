import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.ConditionType

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Sign In/PSSISignInValidData'), [:])

WebUI.navigateToUrl(baseUrl + '/data_user')

// ke page berikut utk validasi ketika sort diklik maka lgsg balik ke page 1
WebUI.scrollToElement(findTestObject('Page_CCTV/page 2'), 1)
WebUI.click(findTestObject('Object Repository/Page_CCTV/page 2'))

// klik button name yang belum aktif 1x utk jd ascending
WebUI.scrollToElement(findTestObject('Page_User Data/Sort Name Unactive'), 0)
WebUI.verifyElementClickable(findTestObject('Page_User Data/Sort Name Unactive'))
WebUI.click(findTestObject('Page_User Data/Sort Name Unactive'))

// cek apakah button 1 aktif karena lagi di halaman 1
TestObject page1Object = findTestObject('Object Repository/Page_CCTV/page 1')
page1Object.addProperty('css', ConditionType.EQUALS, 'li.paginate_button.page-item.active > a.page-link')
WebUI.verifyElementPresent(page1Object, 3)

// ke page berikut utk validasi ketika sort diklik maka lgsg balik ke page 1
WebUI.scrollToElement(findTestObject('Page_CCTV/page 2'), 1)
WebUI.click(findTestObject('Object Repository/Page_CCTV/page 2'))

// klik button name yang belum aktif 1x lg utk jd descending
WebUI.scrollToElement(findTestObject('Page_User Data/Sort Name Ascending'), 0)
WebUI.verifyElementClickable(findTestObject('Page_User Data/Sort Name Ascending'))
WebUI.click(findTestObject('Page_User Data/Sort Name Ascending'))

// cek apakah button 1 aktif karena lagi di halaman 1
WebUI.verifyElementPresent(page1Object, 3)

// next step http req ke backend utk tau di nomor 1 hrusnya siapa
WebUI.verifyTextPresent('zzzzzzzzzzzzzzzzz',false)

WebUI.closeBrowser()