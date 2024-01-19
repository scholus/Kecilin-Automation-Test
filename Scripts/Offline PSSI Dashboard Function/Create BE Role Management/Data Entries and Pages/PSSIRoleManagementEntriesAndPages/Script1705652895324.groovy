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

// Belum lengkap, belum bisa cek data shown, entry dan page nya bener atau engga
// Belum sempurna, butuh api doc untuk bisa http request
FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Role Management/View Role Management/PSSIViewRoleManagement'), [:], failureHandling)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CCTV/Data Entries Option'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CCTV/Data Entries Option'), '100', true)

WebUI.scrollToElement(findTestObject('Page_CCTV/page 1'), 1)

// cek apakah button 1 aktif karena lagi di halaman 1
TestObject page1Object = findTestObject('Object Repository/Page_CCTV/page 1')
page1Object.addProperty('css', ConditionType.EQUALS, 'li.paginate_button.page-item.active > a.page-link')
boolean is1Active = WebUI.verifyElementPresent(page1Object, 3)

if (is1Active) {
	KeywordUtil.markPassed('Test passed because user still on page 1')
} else {
	KeywordUtil.markFailedAndStop('Test failed because page function is broken')
}

WebUI.scrollToElement(findTestObject('Page_CCTV//Data Entries Option'), 1)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CCTV/Data Entries Option'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CCTV/Data Entries Option'), '10', true)

WebUI.scrollToElement(findTestObject('Page_CCTV/page 2'), 1)

WebUI.click(findTestObject('Object Repository/Page_CCTV/page 2'))

// cek apakah button 2 aktif karena lagi di halaman 2
TestObject page2Object = findTestObject('Object Repository/Page_CCTV/page 2')
page2Object.addProperty('css', ConditionType.EQUALS, 'li.paginate_button.page-item.active > a.page-link')
boolean is2Active = WebUI.verifyElementPresent(page2Object, 3)

if (is2Active) {
	KeywordUtil.markPassed('Test passed because user still on page 2')
} else {
	KeywordUtil.markFailedAndStop('Test failed because page function is broken')
}

WebUI.closeBrowser()