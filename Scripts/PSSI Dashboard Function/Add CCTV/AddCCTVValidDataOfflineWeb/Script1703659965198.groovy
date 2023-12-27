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

FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE
String baseUrl = GlobalVariable.online_pssi_dashboard_url
WebUI.callTestCase(findTestCase('PSSI Dashboard Function/Sign In/SignInValidData'), [:], failureHandling)

WebUI.navigateToUrl(baseUrl+'/cctv/stadion', failureHandling)

WebUI.navigateToUrl(baseUrl+'/cctv/detail/64fea065acbef66fd5476494', failureHandling)

WebUI.navigateToUrl(baseUrl+'/cctv/detail/64fea065acbef66fd5476494/create', failureHandling)

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_Name_name'), 'camera1', failureHandling)
WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'), '1001', failureHandling)
WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'), 'https://google.com', failureHandling)

WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), failureHandling)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CCTV/span_CCTV Data'), 0, failureHandling)) {
    KeywordUtil.markPassed('Test passed because conditionPass is true')
} else {
    KeywordUtil.markFailed('Test failed because conditionFails is true')
}

WebUI.closeBrowser()