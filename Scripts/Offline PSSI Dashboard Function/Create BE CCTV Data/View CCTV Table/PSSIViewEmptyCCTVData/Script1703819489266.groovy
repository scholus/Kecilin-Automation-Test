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

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE CCTV Data/View Stadium/PSSIViewStadiumData'), [:], failureHandling)

WebUI.navigateToUrl(baseUrl + '/cctv/detail/64fea04aacbef66fd547646c', failureHandling)

// Validasi kalau ada angka 'Showing 0 to 0 of 0 entries' dan ada tulisan 'No matching records found' maka sukses,
// Karena artinya memang beneran gak ada data
if (WebUI.verifyTextPresent('CCTV Data', false, failureHandling)) {
    if (WebUI.verifyTextPresent('Showing 0 to 0 of 0 entries', false) && WebUI.verifyTextPresent('No matching records found', 
        false)) {
        KeywordUtil.markPassed('Test passed because user successfully redirected to camera logs and display no data message')
    } else {
        KeywordUtil.markFailed('Test failed because either entries is broken or no empty message')
    }
} else {
    KeywordUtil.markFailed('Test failed because user is not redirected to camera logs')
}

WebUI.closeBrowser()

