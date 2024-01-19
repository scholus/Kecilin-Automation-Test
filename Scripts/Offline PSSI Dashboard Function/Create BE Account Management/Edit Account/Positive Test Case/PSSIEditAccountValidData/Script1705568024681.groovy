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

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Account Management/View Account Management/PSSIViewAccountManagement'), [:], failureHandling)

//ke page edit account, masih hardcode
WebUI.navigateToUrl(baseUrl + '/accounts/edit/652c095d63d9d69bc80121ca', failureHandling)

//isi field dengan valid data
WebUI.clearText(findTestObject('Page_Create Account/Name Field'))
WebUI.clearText(findTestObject('Page_Create Account/Email Field'))
WebUI.clearText(findTestObject('Page_Create Account/Password Field'))
WebUI.clearText(findTestObject('Page_Create Account/Image Field'))
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Name Field'))
WebUI.setText(findTestObject('Page_Create Account/Name Field'), 'heheheasas')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Email Field'))
WebUI.setText(findTestObject('Page_Create Account/Email Field'), 'hehehasasase1@yoo.com')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Password Field'))
WebUI.setText(findTestObject('Page_Create Account/Password Field'), 'Password')
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Role Selection'))
WebUI.selectOptionByValue(findTestObject('Page_Create Account/Role Selection'), 'Viewer', true)

//upload image
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Image Field'))
WebUI.uploadFile(findTestObject('Page_Create Account/Image Field'), 'C:\\Users\\USER\\Downloads\\unnamed (3).jpg')

//klik save
WebUI.verifyElementClickable(findTestObject('Page_Create Account/Save Button'))
WebUI.click(findTestObject('Page_Create Account/Save Button'))

//verifikasi sudah balik ke tabel account management
WebUI.verifyTextPresent('Add New', false)
WebUI.verifyTextPresent('Status', false)
WebUI.verifyTextPresent('Action', false)
WebUI.verifyTextPresent('entries', false)

//verifikasi data udh keubah
//cara ceknya masih harus diubah
WebUI.verifyTextPresent('hehehasasase@yoo.com', false)

WebUI.closeBrowser()