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
WebUI.navigateToUrl(baseUrl + '/roles/create', failureHandling)

//isi field dengan exceed max char (nama dan desc)
WebUI.verifyElementClickable(findTestObject('Page_Add Role/Role Name Field'))
WebUI.setText(findTestObject('Page_Add Role/Role Name Field'), 'superadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminsahskljagsaslssssbrisuperadminaa@y.com')
WebUI.verifyElementClickable(findTestObject('Page_Add Role/Desc Field')) //skr test obj nya blm ada
WebUI.setText(findTestObject('Page_Add Role/Desc Field'), 'superadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminsahskljagsaslssssbrisuperadminaa@y.com')
WebUI.click(findTestObject('Page_Add Role/CCTV Data Delete Toggle'))

//klik save
WebUI.scrollToElement(findTestObject('Page_Add Role/Save Button'), 0)
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Save Button'))
WebUI.click(findTestObject('Page_Create Account/Save Button'))

//verifikasi masih di page add role
WebUI.verifyTextPresent('Add New Role Management', false)
WebUI.verifyTextPresent('Permissions', false)
WebUI.verifyTextPresent('BACK', false)

//verifikasi ada pesan error
WebUI.verifyTextPresent('invalid value', false)

WebUI.closeBrowser()