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

// buka user data detail
WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Sign In/PSSISignInValidData'), [:])

WebUI.navigateToUrl(baseUrl + '/data_user')

WebUI.verifyElementClickable(findTestObject('Page_User Data/Action Button on 1st Row of User'))

WebUI.click(findTestObject('Page_User Data/Action Button on 1st Row of User'))

// maximize profile image
WebUI.scrollToElement(findTestObject('Page_Detail User/maximize image'), 1)

WebUI.verifyElementClickable(findTestObject('Page_Detail User/maximize image'))

WebUI.click(findTestObject('Page_Detail User/maximize image'))

// klik zoom in
WebUI.verifyElementClickable(findTestObject('Page_Detail User/zoom in'))
WebUI.click(findTestObject('Page_Detail User/zoom in'))

// verifikasi udah zoom in

// balik ke awal dan zoom out
WebUI.verifyElementClickable(findTestObject('Page_Detail User/close photo button'))
WebUI.click(findTestObject('Page_Detail User/close photo button'))
WebUI.scrollToElement(findTestObject('Page_Detail User/maximize image'), 1)
WebUI.verifyElementClickable(findTestObject('Page_Detail User/maximize image'))
WebUI.click(findTestObject('Page_Detail User/maximize image'))
WebUI.verifyElementClickable(findTestObject('Page_Detail User/zoom out'))
WebUI.click(findTestObject('Page_Detail User/zoom out'))

// verifikasi udah zoom out

WebUI.closeBrowser()