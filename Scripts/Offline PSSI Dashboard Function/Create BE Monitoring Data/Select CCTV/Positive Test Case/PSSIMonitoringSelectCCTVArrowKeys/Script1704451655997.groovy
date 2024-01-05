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

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Monitoring Data/View Monitoring Data/PSSIViewMonitoringData'), 
    [:])

// buka left camera selection
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Left Camera Selection'))

WebUI.click(findTestObject('Page_Monitoring/Left Camera Selection'))

// jalanin arrow keys 2x kebawah
WebUI.sendKeys(findTestObject('Page_Monitoring/Left search field'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Page_Monitoring/Left search field'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Page_Monitoring/Left search field'), Keys.chord(Keys.ENTER))

// verify videonya bisa tampil
WebUI.waitForElementVisible(findTestObject('Page_Monitoring/Left Loading CCTV stream'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Monitoring/Left Loading CCTV stream'))

WebUI.waitForElementVisible(findTestObject('Page_Monitoring/Left Camera Playing'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Monitoring/Left Camera Playing'))

// verify videonya jalan
byte[] screenshot1 = WebUI.takeFullPageScreenshot()
Thread.sleep(5000)
byte[] screenshot2 = WebUI.takeFullPageScreenshot()

WebUI.verifyNotEqual(screenshot1, screenshot2)

// buka right camera selection dan search cctv
WebUI.scrollToElement(findTestObject('Page_Monitoring/Right Camera Selection'), 1)

WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Right Camera Selection'))

WebUI.click(findTestObject('Page_Monitoring/Right Camera Selection'))

// jalanin arrow keys 2x kebawah
WebUI.sendKeys(findTestObject('Page_Monitoring/Right search field'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Page_Monitoring/Right search field'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Page_Monitoring/Right search field'), Keys.chord(Keys.ENTER))

// verify videonya bisa tampil
WebUI.waitForElementVisible(findTestObject('Page_Monitoring/Right Loading CCTV stream'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Monitoring/Right Loading CCTV stream'))

WebUI.waitForElementVisible(findTestObject('Page_Monitoring/Right Camera Playing'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Monitoring/Right Camera Playing'))

// verify videonya jalan
byte[] screenshot3 = WebUI.takeFullPageScreenshot()
Thread.sleep(5000)
byte[] screenshot4 = WebUI.takeFullPageScreenshot()

WebUI.verifyNotEqual(screenshot1, screenshot2)

// buka bottom camera selection dan search cctv
WebUI.scrollToElement(findTestObject('Page_Monitoring/Bottom Camera Selection'), 1)

WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Bottom Camera Selection'))

WebUI.click(findTestObject('Page_Monitoring/Bottom Camera Selection'))

// jalanin arrow keys 2x kebawah
WebUI.sendKeys(findTestObject('Page_Monitoring/Bottom search field'), Keys.chord(Keys.ARROW_DOWN))
WebUI.sendKeys(findTestObject('Page_Monitoring/Bottom search field'), Keys.chord(Keys.ENTER))

// verify videonya bisa tampil
WebUI.waitForElementVisible(findTestObject('Page_Monitoring/Bottom Loading CCTV stream'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Monitoring/Bottom Loading CCTV stream'))

WebUI.waitForElementVisible(findTestObject('Page_Monitoring/Bottom Camera Playing'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Monitoring/Bottom Camera Playing'))

// verify videonya jalan
byte[] screenshot5 = WebUI.takeFullPageScreenshot()
Thread.sleep(5000)
byte[] screenshot6 = WebUI.takeFullPageScreenshot()

WebUI.verifyNotEqual(screenshot1, screenshot2)