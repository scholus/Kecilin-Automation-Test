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

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Playback Video/View Playback Video Data/PSSIViewPlaybackVideo'), 
    [:])

// pilih stadium
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/Stadium Selection Bar'))
WebUI.click(findTestObject('Page_Playback Video/Stadium Selection Bar'))
WebUI.sendKeys(findTestObject('Page_Playback Video/Stadium Search Field'), Keys.chord(Keys.ENTER))

// pilih cctv
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/CCTV Selection Bar'))

WebUI.click(findTestObject('Page_Playback Video/CCTV Selection Bar'))

// skenario 1: tutup selection dengan klik bar nya
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/CCTV Selection Bar'))
WebUI.click(findTestObject('Page_Playback Video/CCTV Selection Bar'))

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Playback Video/CCTV Search Field'),0)

// skenario 2: tutup selection dengan klik area luar
WebUI.verifyElementClickable(findTestObject('Page_Playback Video/CCTV Selection Bar')) // buka dulu
WebUI.click(findTestObject('Page_Playback Video/CCTV Selection Bar'))
WebUI.clickOffset(findTestObject('Page_Playback Video/CCTV Selection Bar'), 50, 100) // ketika udh kebuka baru klik bagian luar

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Playback Video/CCTV Search Field'),0)

WebUI.closeBrowser()