import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
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

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE Role Management/View Role Management/PSSIViewRoleManagement'), 
    [:], failureHandling)

//delete account
WebUI.scrollToElement(findTestObject('Page_Role Management/Delete Button asas'),0)
WebUI.click(findTestObject('Page_Role Management/Delete Button asas'))

//close delete box
//skenario 1: click area outside of box
WebUI.clickOffset(findTestObject('Page_Role Management/Delete Pop Up'), 100, 100)

verifyStillOnPage()

//skenario 2: click close icon
WebUI.scrollToElement(findTestObject('Page_Role Management/Delete Button asas'),0)
WebUI.click(findTestObject('Page_Role Management/Delete Button asas'))
WebUI.click(findTestObject('Page_Role Management/Close Pop Up'))

verifyStillOnPage()

//skenario 3: click escape button
WebUI.scrollToElement(findTestObject('Page_Role Management/Delete Button asas'),0)
WebUI.click(findTestObject('Page_Role Management/Delete Button asas'))
Keys.chord(Keys.ESCAPE)
verifyStillOnPage()

WebUI.closeBrowser() 

def verifyStillOnPage() {
	//verifikasi masih di tabel role management
	WebUI.verifyTextPresent('2', false)
	WebUI.verifyTextPresent('entries', false)
	
	//verifikasi data masih ada
	//cara ceknya masih harus diubah
	WebUI.scrollToElement(findTestObject('Page_Role Management/Delete Button asas'), 0)
	WebUI.verifyTextPresent('asas', false)
}

