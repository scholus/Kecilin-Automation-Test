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
String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE CCTV Data/Sign In/PSSISignInValidData'), [:], failureHandling)

WebUI.navigateToUrl(baseUrl+'/cctv/stadion', failureHandling)

// id stadion masih di hard code, akan diganti ke http request kalau sudah ada API doc
WebUI.navigateToUrl(baseUrl+'/cctv/detail/64fea065acbef66fd5476494', failureHandling)

WebUI.navigateToUrl(baseUrl+'/cctv/detail/64fea065acbef66fd5476494/create', failureHandling)

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_Name_name'), 
'qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm', failureHandling)
WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'),
'qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm', failureHandling)
WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'),
'qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm', failureHandling)

scrollThenClickSave()

WebUI.verifyTextPresent('Add new CCTV',false)

String excMaxChar = GlobalVariable.negativeTestPassedExcMaxChar
String errorMessageAppear = GlobalVariable.negativeTestPassedErrorMessageAppear
String dataInvalid = GlobalVariable.dataInvalid

int count = WebUI.verifyTextPresent(dataInvalid, false)
if (count == 3) {
		KeywordUtil.markPassed(errorMessageAppear)
		KeywordUtil.markPassed(excMaxChar)
}

WebUI.verifyTextNotPresent('Add new CCTV', false)

WebUI.closeBrowser()

def scrollThenClickSave() {
	WebUI.scrollToElement(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), 1)

	WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'))
}