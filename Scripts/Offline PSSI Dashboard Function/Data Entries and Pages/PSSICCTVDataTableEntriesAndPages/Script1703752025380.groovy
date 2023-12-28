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
import com.kms.katalon.core.testobject.ConditionType

// Belum lengkap, belum bisa cek data shown, entry dan page nya bener atau engga
FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE

String baseUrl = GlobalVariable.online_pssi_dashboard_url

WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/View CCTV Table/PSSIViewCCTVData'), [:], failureHandling)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CCTV/Data Entries Option'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CCTV/Data Entries Option'), '100', true)

WebUI.scrollToElement(findTestObject('Page_CCTV/page 1'), 1)

//String backgroundColor = WebUI.getCSSValue('Object Repository/Page_CCTV/page 1', 'background-color')
TestObject page1Object = findTestObject('Object Repository/Page_CCTV/page 1')
page1Object.addProperty('css', ConditionType.EQUALS, 'li.paginate_button.page-item.active > a.page-link')
boolean is1Active = WebUI.verifyElementPresent(page1Object, 3)

if (is1Active) {
	KeywordUtil.markPassed('Test passed because user still on page 1')
} else {
	KeywordUtil.markFailed('Test failed because page function is broken')
}

//TestObject tableObject = findTestObject('Object Repository/Page_CCTV/Data Entries Option and Table')
//
//TestObject dataEntryObject = findTestObject('Object Repository/Page_CCTV/Data Entries Information')
//ResponseObject tableResponse = WS.sendRequest(findTestObject('path/to/tableRequest'))
//
//// Extract the last number from the table row
//String tableData = WS.getResponseText(tableResponse)
//String[] tableRows = tableData.split('\n')
//String lastTableRow = tableRows[tableRows.length - 1]
//int lastNumberInTableRow = Integer.parseInt(lastTableRow.split('\t').last())
//
//// Get the total data from the data entry information
//String totalData = WebUI.getText(dataEntryObject)
//int totalDataNumber = Integer.parseInt(totalData)
//
//// Compare the last number in the table row with the total data
//if (lastNumberInTableRow == totalDataNumber) {
//	// Last number matches the total data
//	println('Last number in table matches total data')
//} else {
//	// Last number does not match the total data
//	println('Last number in table does not match total data')
//}

WebUI.scrollToElement(findTestObject('Page_CCTV//Data Entries Option'), 1)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CCTV/Data Entries Option'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CCTV/Data Entries Option'), '25', true)

WebUI.scrollToElement(findTestObject('Page_CCTV/page 2'), 1)

WebUI.click(findTestObject('Object Repository/Page_CCTV/page 2'))

TestObject page2Object = findTestObject('Object Repository/Page_CCTV/page 2')
page2Object.addProperty('css', ConditionType.EQUALS, 'li.paginate_button.page-item.active > a.page-link')
boolean is2Active = WebUI.verifyElementPresent(page2Object, 3)

if (is2Active) {
	KeywordUtil.markPassed('Test passed because user still on page 2')
} else {
	KeywordUtil.markFailed('Test failed because page function is broken')
}

WebUI.closeBrowser()