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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Download/Filter Download/Positive Test Case/PSSIFilterStadiumAndCam'), 
    [:])

//verifikasi tombol multiple download gaad
WebUI.verifyElementNotPresent(findTestObject('Page_Download/Multiple Download Button'), 1)

//cari dan tick checkbox
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Download/First Row Checkbox')) //skr test obj blm ada
WebUI.click(findTestObject('Object Repository/Page_Download/First Row Checkbox'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Download/Second Row Checkbox')) //skr test obj blm ada
WebUI.click(findTestObject('Object Repository/Page_Download/Second Row Checkbox'))

//verifikasi tombol download ada
WebUI.verifyElementPresent(findTestObject('Page_Download/Multiple Download Button'), 1)
WebUI.verifyElementClickable(findTestObject('Page_Download/Multiple Download Button'), 1)
WebUI.click(findTestObject('Page_Download/Multiple Download Button'))

//cari dan untick checkbox
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Download/First Row Checkbox')) //skr test obj blm ada
WebUI.click(findTestObject('Object Repository/Page_Download/First Row Checkbox'))
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Download/Second Row Checkbox')) //skr test obj blm ada
WebUI.click(findTestObject('Object Repository/Page_Download/Second Row Checkbox'))

//verifikasi tombol download ga ada
WebUI.verifyElementPresent(findTestObject('Page_Download/Multiple Download Button'), 1)
WebUI.verifyElementClickable(findTestObject('Page_Download/Multiple Download Button'), 1)
WebUI.click(findTestObject('Page_Download/Multiple Download Button'))

WebUI.closeBrowser()

