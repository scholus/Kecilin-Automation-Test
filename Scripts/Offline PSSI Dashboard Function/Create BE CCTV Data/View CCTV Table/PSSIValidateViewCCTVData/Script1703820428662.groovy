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

// untuk validasi tiap button tampilin kamera dari stadium yang terpilih
FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE
String baseUrl = GlobalVariable.offline_pssi_dashboard_url+'/cctv/detail/'
WebUI.callTestCase(findTestCase('Offline PSSI Dashboard Function/Create BE CCTV Data/View Stadium/PSSIViewStadiumData'), [:], failureHandling)
def breadcrumbClick() {
	WebUI.verifyElementClickable(findTestObject('Page_CCTV/Stadium Breadcrumb'))
	WebUI.click(findTestObject('Page_CCTV/Stadium Breadcrumb'))
}
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CCTV/Data Entries Option'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CCTV/Data Entries Option'), '100', true)

WebUI.navigateToUrl(baseUrl + '64fea065acbef66fd5476494', failureHandling)

if (WebUI.verifyTextPresent('Stadion Gelora Bangkalan', false, failureHandling)
	&&WebUI.verifyTextPresent('Bangkalan, Jawa Timur', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64fea04aacbef66fd547646c', failureHandling)

if (WebUI.verifyTextPresent('Stadion Gelora Bung Tomo', false, failureHandling)
	&&WebUI.verifyTextPresent('Jawa timur', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '651fc74ee8351d2a27c0b013', failureHandling)

if (WebUI.verifyTextPresent('Stadium Teladan', false, failureHandling)
	&&WebUI.verifyTextPresent('Jalan Utara', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '6503d9fc8b2999b8c86abf13', failureHandling)

if (WebUI.verifyTextPresent('Stadion Surajaya', false, failureHandling)
	&&WebUI.verifyTextPresent('Jl. Raya Gresik - Babat, Deket Kulon', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '65015f469914027913bf9aed', failureHandling)

if (WebUI.verifyTextPresent('Stadion Gajayana Malang', false, failureHandling)
	&&WebUI.verifyTextPresent('Malang, Jawa Timur', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '650140a5acbef66fd5476771', failureHandling)

if (WebUI.verifyTextPresent('Stadion Brawijaya Kediri', false, failureHandling)
	&&WebUI.verifyTextPresent('Kediri, Jawa Timur', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '65013f34c3de4ca4d18e0361', failureHandling)

if (WebUI.verifyTextPresent('Stadion Gelora Delta', false, failureHandling)
	&&WebUI.verifyTextPresent('Sidoarjo, Jawa Timur', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64fe9fe4acbef66fd5476434', failureHandling)

if (WebUI.verifyTextPresent('Stadion Maguwoharjo Sleman', false, failureHandling)
	&&WebUI.verifyTextPresent('Sleman, Daerah Istimewa Yogyakarta', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64fe9fd0acbef66fd547641b', failureHandling)

if (WebUI.verifyTextPresent('Stadion Manahan', false, failureHandling)
	&&WebUI.verifyTextPresent('Surakarta, Jawa Tengah', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64fe98eeacbef66fd54761ca', failureHandling)

if (WebUI.verifyTextPresent('Stadion Gelora Bandung Lautan Api', false, failureHandling)
	&&WebUI.verifyTextPresent('Gedebage, Kota Bandung', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64fe9700acbef66fd5476193', failureHandling)

if (WebUI.verifyTextPresent('Stadion Si Jalak Harupat', false, failureHandling)
	&&WebUI.verifyTextPresent('Bandung, Jawa Barat 40911', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64fe92a6acbef66fd547616a', failureHandling)

if (WebUI.verifyTextPresent('Stadion Patriot', false, failureHandling)
	&&WebUI.verifyTextPresent('Bekasi', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64fe9101acbef66fd5476111', failureHandling)

if (WebUI.verifyTextPresent('Indomilk Arena Stadium', false, failureHandling)
	&&WebUI.verifyTextPresent('Kabupaten Tangerang, Banten', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64f19cd1cd8a9e11041e3929', failureHandling)

if (WebUI.verifyTextPresent('Stadion Madya Gelora Bung Karno', false, failureHandling)
	&&WebUI.verifyTextPresent('Daerah Khusus Ibukota Jakarta', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.navigateToUrl(baseUrl + '64e781017d48807cc246b18f', failureHandling)

if (WebUI.verifyTextPresent('Stadion Utama Gelora Bung Karno', false, failureHandling)
	&&WebUI.verifyTextPresent('Daerah Khusus Ibukota Jakarta', false, failureHandling)){
	KeywordUtil.markPassed('Test passed because user successfully displayed CCTV Data from selected stadium')
}else {
	KeywordUtil.markFailed('Test passed because user is not displayed CCTV Data from selected stadium')
}

breadcrumbClick()

WebUI.closeBrowser()