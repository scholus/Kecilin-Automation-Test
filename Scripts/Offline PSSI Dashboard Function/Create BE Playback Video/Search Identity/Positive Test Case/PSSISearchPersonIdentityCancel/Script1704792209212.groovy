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
import java.util.regex.Pattern as Pattern

// blm sempurna blm bisa verifikasi drag box dan hasil identify
String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Playback Video/Play Video/PSSIPlayVideo'), 
    [:])

//klik search identity
WebUI.click(findTestObject('Page_Playback Video/button_Search Identify'))

//verifikasi pop up kebuka
WebUI.verifyTextPresent('CANCEL', false)
WebUI.verifyTextPresent('Identity Now', false)

//klik identify now
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/button_Cancel Pop Up'))
WebUI.click(findTestObject('Page_Playback Video/button_Cancel Pop Up'))

// verify udh keclosed dan balik ke play video
WebUI.verifyTextNotPresent('CANCEL', false)
WebUI.verifyTextNotPresent('Identity Now', false)

WebUI.closeBrowser()