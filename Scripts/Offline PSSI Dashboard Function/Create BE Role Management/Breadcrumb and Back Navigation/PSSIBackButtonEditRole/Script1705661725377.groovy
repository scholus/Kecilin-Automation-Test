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

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Role Management/View Role Management/PSSIViewRoleManagement'), [:])

//ke page edit account
//id account msh hardcode kalau ada api doc baru http request trus pilih
WebUI.navigateToUrl(baseUrl + '/roles/edit/65ade43e12ca78ff5335c467')

//cari dan klik back button
WebUI.verifyElementPresent(findTestObject('Page_Edit Role/Back Button'),1)
WebUI.verifyElementClickable(findTestObject('Page_Edit Role/Back Button'))
WebUI.click(findTestObject('Page_Edit Role/Back Button'))

//verifikasi sudah balik ke tabel role management
WebUI.verifyTextPresent('Description', false)
WebUI.verifyTextPresent('Action', false)
WebUI.verifyTextPresent('Name', false)
WebUI.verifyTextPresent('entries', false)

WebUI.closeBrowser()