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

WebUI.callTestCase(findTestCase('PSSI Dashboard Function/Sign In/SignInValidData'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_CCTV Data'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Stadium/a_btn btn-action btn-action--detail'))

WebUI.click(findTestObject('Object Repository/Page_Stadium/a_btn btn-action btn-action--detail'))

WebUI.verifyElementClickable(findTestObject('Page_CCTV/a_Add New'))

WebUI.click(findTestObject('Object Repository/Page_CCTV/a_Add New'))

WebUI.setText(findTestObject('Object Repository/Page_Add new CCTV/input_name'), 'camera1')

WebUI.setText(findTestObject('Object Repository/Page_Add new CCTV/input_cctv_id'), '1001')

WebUI.setText(findTestObject('Object Repository/Page_Add new CCTV/input_rtsp'), 'https://google.com')

WebUI.click(findTestObject('Object Repository/Page_Add new CCTV/button_Save'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CCTV/span_CCTV Data'), 0)) {
    KeywordUtil.markPassed('Test passed because conditionPass is true')
} else {
    KeywordUtil.markFailed('Test failed because conditionFails is true')
}

WebUI.closeBrowser()

