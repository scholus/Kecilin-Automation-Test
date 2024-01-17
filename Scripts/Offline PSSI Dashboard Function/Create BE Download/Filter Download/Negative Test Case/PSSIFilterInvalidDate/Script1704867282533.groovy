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
import java.text.SimpleDateFormat
import java.util.Date

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Download/View Download Page/PSSIViewDownloadPage'), [:])

//pastiin dulu selection bar cctv blm ada
WebUI.verifyElementNotPresent(findTestObject('Page_Playback Video/CCTV Selection Bar'),0)

//mulai cari stadium
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/Stadium Selection Bar'))
WebUI.click(findTestObject('Page_Playback Video/Stadium Selection Bar'))
WebUI.sendKeys(findTestObject('Page_Playback Video/Stadium Search Field'), Keys.chord(Keys.ENTER))

//cari cctv
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/CCTV Selection Bar'))
WebUI.click(findTestObject('Page_Playback Video/CCTV Selection Bar'))
WebUI.sendKeys(findTestObject('Page_Playback Video/CCTV Search Field'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Page_Playback Video/CCTV Search Field'), Keys.chord(Keys.ENTER))

//input tanggal
WebUI.setText(findTestObject('Page_Playback Video/input_Date_field'), '20012024')

//search
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/button_Search'))
WebUI.click(findTestObject('Page_Playback Video/button_Search'))

//verifikasi ga muncul tabel
WebUI.verifyTextNotPresent('Size', false)
WebUI.verifyTextNotPresent('Name', false)
WebUI.verifyTextNotPresent('Date Time', false)
WebUI.verifyTextNotPresent('Action', false)

//verifikasi muncul pesan error
WebUI.verifyTextPresent('Invalid Date', false)

WebUI.closeBrowser()