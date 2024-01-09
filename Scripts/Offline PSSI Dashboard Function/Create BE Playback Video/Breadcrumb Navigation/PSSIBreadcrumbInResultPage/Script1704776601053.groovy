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

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Playback Video/Search Identity/Positive Test Case/PSSIPlaybackVideoSearchIdentity'), [:])

// cari dan klik breadcrumb playback video	
WebUI.verifyElementClickable(findTestObject('Page_Result/Breadcrumb Playback Video')) //skrg test obj blm ad
WebUI.click(findTestObject('Page_Result/Breadcrumb Playback Video'))

// verify sudah balik ke page playback video
WebUI.verifyTextPresent('#', false)
WebUI.verifyTextPresent('Size', false)
WebUI.verifyTextPresent('Name', false)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Playback Video/Search Identity/Positive Test Case/PSSIPlaybackVideoSearchIdentity'), [:])

// cari dan klik breadcrumb play video
WebUI.verifyElementClickable(findTestObject('Page_Result/Breadcrumb Play Video')) //skrg test obj blm ad
WebUI.click(findTestObject('Page_Result/Breadcrumb Play Video'))

// verify sudah balik ke page play video
WebUI.scrollToElement(findTestObject('Page_Playback Video/button_Search Identify'), 0)
WebUI.verifyTextPresent('Search Identify', false)
