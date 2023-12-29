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

FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE

String baseUrl = GlobalVariable.offline_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE CCTV Data/View CCTV Table/PSSIViewCCTVData'), [:], failureHandling)

WebUI.navigateToUrl(baseUrl + '/cctv/detail/64fea065acbef66fd5476494/edit/658cfd5e12ca78ff5334e922', failureHandling)

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_Name_name'))

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'))

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'))

WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), failureHandling)

if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Edit CCTV Field Title'), 0, failureHandling)) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message CCTV ID Invalid value'), 0, failureHandling)) {
        KeywordUtil.markFailed('Test failed because there is additional error message')
    } else {
		if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field CCTV ID is required'), 0, failureHandling) && 
			WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field Name is required'), 0, failureHandling) &&
			WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message RTSP is required'), 0, failureHandling)) {
			KeywordUtil.markPassed('Test passed because error message appear')
		}
        KeywordUtil.markPassed('Test passed because user cannot save add cctv with emtpy mandatory')
    }
} else {
    KeywordUtil.markFailed('Test failed because user redirected to cctv table page')
}

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_Name_name'), 'camera2', failureHandling)

WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), failureHandling)

if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Edit CCTV Field Title'), 0, failureHandling)) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message CCTV ID Invalid value'), 0, failureHandling)) {
        KeywordUtil.markFailed('Test failed because there is additional error message')
    } else {
		if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field CCTV ID is required'), 0, failureHandling) &&
			WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field RTSP is required'), 0, failureHandling)) {
			KeywordUtil.markPassed('Test passed because error message appear')
		}
        KeywordUtil.markPassed('Test passed because user cannot save edit cctv with emtpy mandatory')
    }
} else {
    KeywordUtil.markFailed('Test failed because user redirected to cctv table page')
}

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'), '1010', failureHandling)

WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), failureHandling)

if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Edit CCTV Field Title'), 0, failureHandling)) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field RTSP is required'), 0, failureHandling)) {
        KeywordUtil.markPassed('Test passed because user cannot save edit cctv with emtpy mandatory')
    } else {
        KeywordUtil.markFailed('Test failed because there is additional error message')
    }
} else {
    KeywordUtil.markFailed('Test failed because user redirected to cctv table page')
}

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_Name_name'))

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'))

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'), 'https://google.com', failureHandling)

WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), failureHandling)

if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Edit CCTV Field Title'), 0, failureHandling)) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message CCTV ID Invalid value'), 0, failureHandling)) {
        KeywordUtil.markFailed('Test failed because there is additional error message')
    } else {
		if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field CCTV ID is required'), 0, failureHandling) &&
			WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field Name is required'), 0, failureHandling)) {
			KeywordUtil.markPassed('Test passed because error message appear')
		}
        KeywordUtil.markPassed('Test passed because user cannot save edit cctv with emtpy mandatory')
    }
} else {
    KeywordUtil.markFailed('Test failed because user redirected to cctv table page')
}

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'))

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'), '1010', failureHandling)

WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), failureHandling)

if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Edit CCTV Field Title'), 0, failureHandling)) {
    if (WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field Name is required'), 0, failureHandling)&&
		WebUI.verifyElementPresent(findTestObject('Page_Edit Stadium/Error Message Field RTSP is required'), 0, failureHandling)) {
        KeywordUtil.markPassed('Test passed because user cannot save edit cctv with emtpy mandatory')
    } else {
        KeywordUtil.markFailed('Test failed because there is additional error message')
    }
} else {
    KeywordUtil.markFailed('Test failed because user redirected to cctv table page')
}

WebUI.closeBrowser()

