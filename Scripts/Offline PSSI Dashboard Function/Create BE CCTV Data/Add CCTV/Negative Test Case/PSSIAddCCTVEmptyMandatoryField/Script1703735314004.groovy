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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE

String baseUrl = GlobalVariable.offline_pssi_dashboard_url
String errorMessageAppear = GlobalVariable.negativeTestPassedErrorMessageAppear
String failedToAddCCTVWithEmptyMandatory = GlobalVariable.negativeTestPassedCannotSaveCCTVEmptyMandatory

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE CCTV Data/View CCTV Table/PSSIViewCCTVData'), 
    [:], failureHandling)

// id stadion masih di hard code, akan diganti ke http request kalau sudah ada API doc
WebUI.navigateToUrl(baseUrl + '/cctv/detail/64fea065acbef66fd5476494/create', failureHandling)

WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), failureHandling)

def verifyIDInvalidNotPresent = WebUI.verifyTextNotPresent(GlobalVariable.dataInvalid, false)

def verifyIDEmptyNotPresent = WebUI.verifyTextNotPresent(GlobalVariable.cctvIdEmpty, false)

def verifyNameEmptyNotPresent = WebUI.verifyTextNotPresent(GlobalVariable.nameEmpty, false)

def verifyRTSPEmptyNotPresent = WebUI.verifyTextNotPresent(GlobalVariable.rtspEmpty, false)

// Skenario kalau semua field kosong
if (WebUI.verifyElementNotPresent(findTestObject('Page_Add new CCTV/Add new CCTV Field Title'), 0, failureHandling)) {
	// kalau masuk kesini artinya suda tidak di page add cctv dan validasi tidak ada yang bekerja
	assert false
} else {
	// kalau masuk kesini artinya masih di page add cctv dan cek wording validasi
    if (!verifyIDInvalidNotPresent) {
    } else {
        if (!verifyIDEmptyNotPresent && !verifyNameEmptyNotPresent && !verifyRTSPEmptyNotPresent) {
        }
		else{
            KeywordUtil.markPassed(errorMessageAppear)
		}
    }
        KeywordUtil.markPassed(failedToAddCCTVWithEmptyMandatory)
}

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_Name_name'), 'camera2', failureHandling)
scrollThenClickSave()

// Skenario kalau field ID dan RTSP kosong
if (WebUI.verifyElementNotPresent(findTestObject('Page_Add new CCTV/Add new CCTV Field Title'), 0, failureHandling)) {
	assert false
} else {
    if (!verifyIDInvalidNotPresent) {
    } else {
        if (!verifyIDEmptyNotPresent && !verifyRTSPEmptyNotPresent) {
        }
		else {
			KeywordUtil.markPassed(errorMessageAppear)
		}
        KeywordUtil.markPassed(failedToAddCCTVWithEmptyMandatory)
    }
}

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'), '1010', failureHandling)
scrollThenClickSave()

// Skenario kalau field RTSP kosong
if (WebUI.verifyElementNotPresent(findTestObject('Page_Add new CCTV/Add new CCTV Field Title'), 0, failureHandling)) {
	assert false
} else {
    if (!verifyRTSPEmptyNotPresent) {
    } else {
        KeywordUtil.markPassed(failedToAddCCTVWithEmptyMandatory)
    }
}

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_Name_name'))

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'))

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'), 'https://google.com', failureHandling)

scrollThenClickSave()

// Skenario kalau field name dan ID kosong
if (WebUI.verifyElementNotPresent(findTestObject('Page_Add new CCTV/Add new CCTV Field Title'), 0, failureHandling)) {
	assert false
} else {
    if (!verifyIDInvalidNotPresent) {
    } else {
        if (!verifyIDEmptyNotPresent && !verifyNameEmptyNotPresent) {
        }
        KeywordUtil.markPassed(failedToAddCCTVWithEmptyMandatory)
    }
}

WebUI.clearText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'))

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'), '1010', failureHandling)

scrollThenClickSave()

// Skenario kalau field name dan RTSP kosong
if (WebUI.verifyElementNotPresent(findTestObject('Page_Add new CCTV/Add new CCTV Field Title'), 0, failureHandling)) {
	assert false
} else {
    if (!verifyNameEmptyNotPresent && !verifyRTSPEmptyNotPresent) {
    } else {
        KeywordUtil.markPassed(failedToAddCCTVWithEmptyMandatory)
    }
}

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_RTSP_rtsp'), 'https://google.com', failureHandling)

WebUI.setText(findTestObject('Object Repository/Page Add new CCTV Offline Web/input_CCTV ID_cctv_id'), '1010', failureHandling)

scrollThenClickSave()

// Skenario kalau field name kosong
if (WebUI.verifyElementNotPresent(findTestObject('Page_Add new CCTV/Add new CCTV Field Title'), 0, failureHandling)) {
	assert false
} else {
	if (!verifyNameEmptyNotPresent) {
	} else {
		KeywordUtil.markPassed(failedToAddCCTVWithEmptyMandatory)
	}
}

WebUI.closeBrowser()

def scrollThenClickSave() {
    WebUI.scrollToElement(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'), 1)

    WebUI.click(findTestObject('Object Repository/Page Add new CCTV Offline Web/button_Save'))
}