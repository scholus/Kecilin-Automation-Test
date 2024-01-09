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

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Playback Video/Play Video/PSSIPlayVideo'), [:])

//klik search identity
WebUI.click(findTestObject('Page_Playback Video/button_Search Identify'))

//verifikasi pop up kebuka
WebUI.verifyTextPresent('CANCEL', false)
WebUI.verifyTextPresent('Identity Now', false)

//klik identify now
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/button_Identity Now Pop Up'))
WebUI.click(findTestObject('Page_Playback Video/button_Identity Now Pop Up'))

//verify udh di page result
WebUI.verifyTextPresent('Name', false)
WebUI.verifyTextPresent('Result', false)

// click save
WebUI.verifyElementClickable(findTestObject('Page_Result/Save Monitoring Result')) //skr test obj nya blm ada krn buttonya blm ada
WebUI.click(findTestObject('Page_Result/Save Monitoring Result')) //skr test obj nya blm ada krn buttonya blm ada

// verifikasi download window kebuka
WebUI.verifyTextNotPresent('Result', false) //verify dengan cara ngecek apakah title result nya ga keliatan

WebUI.closeBrowser()