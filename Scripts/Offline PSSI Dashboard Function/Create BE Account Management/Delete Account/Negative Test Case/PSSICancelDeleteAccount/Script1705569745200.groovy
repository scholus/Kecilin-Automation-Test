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

//delete account
WebUI.click(findTestObject('Page_Account Management/button delete viewer8'))

//batalin delete
WebUI.verifyElementClickable(findTestObject('Page_Account Management/Cancel Button pop up'))
WebUI.click(findTestObject('Page_Account Management/Cancel Button pop up'))

//verifikasi masih di tabel account management
WebUI.verifyTextPresent('Add New', false)
WebUI.verifyTextPresent('Status', false)
WebUI.verifyTextPresent('Action', false)
WebUI.verifyTextPresent('entries', false)

//verifikasi data masih ada
//cara ceknya masih harus diubah
WebUI.scrollToElement(findTestObject('Page_Account Management/button delete viewer8'), 0)
WebUI.verifyTextPresent('viewer8', false)

WebUI.closeBrowser()