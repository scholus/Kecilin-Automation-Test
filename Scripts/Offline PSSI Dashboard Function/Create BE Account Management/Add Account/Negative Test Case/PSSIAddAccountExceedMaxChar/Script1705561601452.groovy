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

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Account Management/View Account Management/PSSIViewAccountManagement'), [:], failureHandling)

//ke page create account
WebUI.navigateToUrl(baseUrl + '/accounts/create', failureHandling)

//isi field name dengan karakter lebih dari 255
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Name Field'))
WebUI.setText(findTestObject('Page_Create Account/Name Field'), 'superadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisuperadmin brisiii')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Email Field'))
WebUI.setText(findTestObject('Page_Create Account/Email Field'), 'vieweruser@yopmail.com')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Password Field'))
WebUI.setText(findTestObject('Page_Create Account/Password Field'), 'Password')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Role Selection'))
WebUI.selectOptionByValue(findTestObject('Page_Create Account/Role Selection'), 'Admin', true)

//klik save
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Save Button'))
WebUI.click(findTestObject('Page_Create Account/Save Button'))

//verifikasi masih di page add account
WebUI.verifyTextPresent('Create Account', false)

//verifikasi ada pesan error
WebUI.verifyTextPresent('Invalid value', false)

//isi field email dengan karakter lebih dari 255
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Name Field'))
WebUI.setText(findTestObject('Page_Create Account/Name Field'), 'superadmin')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Email Field'))
WebUI.setText(findTestObject('Page_Create Account/Email Field'), 'superadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminsahskljagsaslssssbrisuperadminaa@y.com')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Password Field'))
WebUI.setText(findTestObject('Page_Create Account/Password Field'), 'Password')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Role Selection'))
WebUI.selectOptionByValue(findTestObject('Page_Create Account/Role Selection'), 'Admin', true)

//klik save
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Save Button'))
WebUI.click(findTestObject('Page_Create Account/Save Button'))

//verifikasi masih di page add account
WebUI.verifyTextPresent('Create Account', false)

//verifikasi ada pesan error
WebUI.verifyTextPresent('Invalid value', false)

//isi field password dengan karakter lebih dari 255
WebUI.clearText(findTestObject('Page_Create Account/Password Field'))
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Email Field'))
WebUI.clearText(findTestObject('Page_Create Account/Email Field'))
WebUI.setText(findTestObject('Page_Create Account/Email Field'), 'hagsjhgs@y.com')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Password Field'))
WebUI.setText(findTestObject('Page_Create Account/Password Field'), 'superadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminbrisuperadminsahskljagsaslssssbrisuperadminaa@y.com')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Role Selection'))
WebUI.selectOptionByValue(findTestObject('Page_Create Account/Role Selection'), 'Admin', true)

//klik save
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Save Button'))
WebUI.click(findTestObject('Page_Create Account/Save Button'))

//verifikasi masih di page add account
WebUI.verifyTextPresent('Create Account', false)

//verifikasi ada pesan error
WebUI.verifyTextPresent('Invalid value', false)

WebUI.closeBrowser()