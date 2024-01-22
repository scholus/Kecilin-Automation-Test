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

FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Role Management/View Role Management/PSSIViewRoleManagement'), [:], failureHandling)

//ke page create account
WebUI.navigateToUrl(baseUrl + '/roles/edit/65ade43e12ca78ff5335c467', failureHandling)

//biarin mandatory field empty

//klik save
WebUI.scrollToElement(findTestObject('Page_Edit Role/Update Button'), 0)
WebUI.verifyElementClickable(findTestObject('Page_Edit Role/Update Button'))
WebUI.click(findTestObject('Page_Edit Role/Update Button'))

//verifikasi masih di page add role
WebUI.verifyTextPresent('Edit Role Management', false)
WebUI.verifyTextPresent('Permissions', false)
WebUI.verifyTextPresent('BACK', false)

//verifikasi ada pesan error
WebUI.verifyTextPresent('Field Name is required', false)
WebUI.verifyTextPresent('Field Description is required', false)

WebUI.closeBrowser()