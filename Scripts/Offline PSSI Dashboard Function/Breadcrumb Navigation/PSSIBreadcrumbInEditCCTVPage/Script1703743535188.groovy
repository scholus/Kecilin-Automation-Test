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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE

String baseUrl = GlobalVariable.online_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/View CCTV Table/PSSIViewCCTVData'), [:], failureHandling)

WebUI.navigateToUrl(baseUrl + '/cctv/detail/64fea065acbef66fd5476494/edit/658be0a112ca78ff5334de2d', failureHandling)

if (WebUI.verifyElementNotPresent(findTestObject('Page_Add new CCTV/CCTV Breadcrumb'), 0, failureHandling)) {
		KeywordUtil.markFailed('Test failed because breadcrumb doesnot exist')
} else {
	
	WebUI.verifyElementClickable(findTestObject('Page_Add new CCTV/CCTV Breadcrumb'))
	WebUI.click(findTestObject('Page_Add new CCTV/CCTV Breadcrumb'))

	if (WebUI.verifyElementPresent(findTestObject('Page_CCTV/CCTV Table Title'), 0, failureHandling)) {
	KeywordUtil.markPassed('Test passed because user can navigate through breadcrumb')
} else {
	KeywordUtil.markFailed('Test failed because user cannot navigate through breadcrumb')
}
}

WebUI.navigateToUrl(baseUrl + '/cctv/detail/64fea065acbef66fd5476494/edit/658cfd5e12ca78ff5334e922', failureHandling)

if (WebUI.verifyElementNotPresent(findTestObject('Page_CCTV/Stadium Breadcrumb'), 0, failureHandling)) {
	KeywordUtil.markFailed('Test failed because breadcrumb doesnot exist')
} else {

WebUI.verifyElementClickable(findTestObject('Page_CCTV/Stadium Breadcrumb'))
WebUI.click(findTestObject('Page_Add new CCTV/CCTV Breadcrumb'))

if (WebUI.verifyElementPresent(findTestObject('Page_Stadium/Stadium Table Title'), 0, failureHandling)) {
KeywordUtil.markPassed('Test passed because user can navigate through breadcrumb')
} else {
KeywordUtil.markFailed('Test failed because user cannot navigate through breadcrumb')
}
}

WebUI.closeBrowser()

