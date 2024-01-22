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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Role Management/View Role Management/PSSIViewRoleManagement'), [:], failureHandling)

//ke page create account
WebUI.navigateToUrl(baseUrl + '/roles/edit/65ade43e12ca78ff5335c467', failureHandling)

//mainin toggle permission
//dashboard
WebUI.click(findTestObject('Page_Add Role/Dashboard Index Toggle'))

//user data
WebUI.click(findTestObject('Page_Add Role/User Data Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/User Data Detail Toggle'))
WebUI.click(findTestObject('Page_Add Role/User Data Delete Toggle'))

//cctv data
WebUI.click(findTestObject('Page_Add Role/CCTV Data Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/CCTV Data Detail Toggle'))
WebUI.click(findTestObject('Page_Add Role/CCTV Data Delete Toggle'))

//scroll k bwh
WebUI.scrollToElement(findTestObject('Page_Edit Role/Update Button'), 0)

//monitoring
WebUI.click(findTestObject('Page_Add Role/Monitoring Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/Monitoring Detail Toggle'))
WebUI.click(findTestObject('Page_Add Role/Monitoring Edit Toggle'))
WebUI.click(findTestObject('Page_Add Role/Monitoring Delete Toggle'))

//hist ident
WebUI.click(findTestObject('Page_Add Role/Hist Ident Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/Hist Ident Detail Toggle'))
WebUI.click(findTestObject('Page_Add Role/Hist Ident Edit Toggle'))
WebUI.click(findTestObject('Page_Add Role/Hist Ident Delete Toggle'))

//scroll k atas
WebUI.scrollToElement(findTestObject('Page_Edit Role/Back Button'), 0)

//playb vid
WebUI.click(findTestObject('Page_Add Role/Playb Vid Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/Playb Vid Create Toggle'))
WebUI.click(findTestObject('Page_Add Role/Playb Vid Edit Toggle'))
WebUI.click(findTestObject('Page_Add Role/Playb Vid Delete Toggle'))

//download
WebUI.click(findTestObject('Page_Add Role/Download Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/Download Create Toggle'))
WebUI.click(findTestObject('Page_Add Role/Download Edit Toggle'))
WebUI.click(findTestObject('Page_Add Role/Download Delete Toggle'))

//scroll k bwh
WebUI.scrollToElement(findTestObject('Page_Edit Role/Update Button'), 0)

//role management
WebUI.click(findTestObject('Page_Add Role/Role Management Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/Role Management Create Toggle'))
WebUI.click(findTestObject('Page_Add Role/Role Management Edit Toggle'))
WebUI.click(findTestObject('Page_Add Role/Role Management Delete Toggle'))

//acc management
WebUI.click(findTestObject('Page_Add Role/Acc Management Index Toggle'))
WebUI.click(findTestObject('Page_Add Role/Acc Management Create Toggle'))
WebUI.click(findTestObject('Page_Add Role/Acc Management Edit Toggle'))
WebUI.click(findTestObject('Page_Add Role/Acc Management Delete Toggle'))

//save trus verifikasi toggel dah keganti
WebUI.click(findTestObject('Page_Edit Role/Update Button'))
WebUI.navigateToUrl(baseUrl + '/roles/edit/65ade43e12ca78ff5335c467', failureHandling)

WebUI.verifyElementPresent(findTestObject('Page_Edit Role/Active Dashboard Index Toggle'), 0)
WebUI.verifyElementPresent(findTestObject('Page_Add Role/CCTV Data Delete Toggle'), 0)

WebUI.closeBrowser()