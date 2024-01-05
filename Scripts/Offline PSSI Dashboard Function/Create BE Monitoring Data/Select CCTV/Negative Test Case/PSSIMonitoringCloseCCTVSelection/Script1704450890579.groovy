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

// buka left camera selection dan search cctv
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Left Camera Selection'))

WebUI.click(findTestObject('Page_Monitoring/Left Camera Selection'))

// skenario 1: tutup selection dengan klik bar nya
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Left Camera Selection'))
WebUI.click(findTestObject('Page_Monitoring/Left Camera Selection'))

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Monitoring/Left search field'),0)

// skenario 2: tutup selection dengan klik area luar
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Left Camera Selection')) // buka dulu
WebUI.click(findTestObject('Page_Monitoring/Left Camera Selection'))
WebUI.clickOffset(findTestObject('Page_Monitoring/Left Camera Selection'), 50, 100) // ketika udh kebuka baru klik bagian luar

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Monitoring/Left search field'),0)

// buka right camera selection dan search cctv
WebUI.scrollToElement(findTestObject('Page_Monitoring/Right Camera Selection'), 1)

WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Right Camera Selection'))

WebUI.click(findTestObject('Page_Monitoring/Right Camera Selection'))

// skenario 1: tutup selection dengan klik bar nya
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Right Camera Selection'))
WebUI.click(findTestObject('Page_Monitoring/Right Camera Selection'))

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Monitoring/Right search field'),0)

// skenario 2: tutup selection dengan klik area luar
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Right Camera Selection')) // buka dulu
WebUI.click(findTestObject('Page_Monitoring/Right Camera Selection'))
WebUI.clickOffset(findTestObject('Page_Monitoring/Right Camera Selection'), 50, 100) // ketika udh kebuka baru klik bagian luar

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Monitoring/Right search field'),0)

// buka bottom camera selection dan search cctv
WebUI.scrollToElement(findTestObject('Page_Monitoring/Bottom Camera Selection'), 1)

WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Bottom Camera Selection'))

WebUI.click(findTestObject('Page_Monitoring/Bottom Camera Selection'))

// skenario 1: tutup selection dengan klik bar nya
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Bottom Camera Selection'))
WebUI.click(findTestObject('Page_Monitoring/Bottom Camera Selection'))

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Monitoring/Bottom search field'),0)

// skenario 2: tutup selection dengan klik area luar
WebUI.verifyElementClickable(findTestObject('Page_Monitoring/Bottom Camera Selection')) // buka dulu
WebUI.click(findTestObject('Page_Monitoring/Bottom Camera Selection'))
WebUI.clickOffset(findTestObject('Page_Monitoring/Bottom Camera Selection'), 50, 100) // ketika udh kebuka baru klik bagian luar

// verify udh beneran ketutup
WebUI.verifyElementNotPresent(findTestObject('Page_Monitoring/Bottom search field'),0)

WebUI.closeBrowser()