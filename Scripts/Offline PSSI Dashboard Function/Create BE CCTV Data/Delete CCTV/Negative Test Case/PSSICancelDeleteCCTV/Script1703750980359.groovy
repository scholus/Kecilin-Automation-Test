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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

// Belum ada tombol konfirmasi cancel jadi validasi seadanya dulu
FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE
String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE CCTV Data/View CCTV Table/PSSIViewCCTVData'), [:], failureHandling)

WebUI.navigateToUrl(baseUrl + '/cctv/detail/64fea065acbef66fd5476494/delete/658cfcc212ca78ff5334e8ed', failureHandling)

// Path test object dan nama test object diganti kalo udh ada button cancel
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CCTV/Button Cancel'), 0, failureHandling)) {
		WebUI.click(findTestObject('Object Repository/Page_CCTV/Button Cancel'), failureHandling)
		KeywordUtil.markPassed('Test passed because data added exists on table')
} else {
	KeywordUtil.markFailed('Test failed because data does not exists on table')
}

String currentUrl = DriverFactory.getWebDriver().getCurrentUrl()

// Define the expected URL
String expectedUrl = baseUrl+'/cctv/detail/64fea065bef66fd5476494'

// Verify if the current URL matches the expected URL
if (currentUrl == expectedUrl) {
	KeywordUtil.markPassed('Test passed because user on the right page')
} else {
	KeywordUtil.markFailed('Test failed because user not on the right page')
}

WebUI.closeBrowser()