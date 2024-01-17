import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();

suiteProperties.put('id', 'Test Suites/Integration Feature People Counting to Dashboard Monitoring/View Detail People Counting Test Suite')
suiteProperties.put('name', 'View Detail People Counting Test Suite')
suiteProperties.put('description', '')
suiteProperties.put('rerunTestFailImmediately', 'true')
suiteProperties.put('retryCount', '3')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\USER\\git\\Kecilin-Automation-Test\\Reports\\20240117_171017\\Integration Feature People Counting to Dashboard Monitoring\\View Detail People Counting Test Suite\\20240117_171026\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Integration Feature People Counting to Dashboard Monitoring/View Detail People Counting Test Suite', suiteProperties, new File("C:\\Users\\USER\\git\\Kecilin-Automation-Test\\Reports\\20240117_171017\\Integration Feature People Counting to Dashboard Monitoring\\View Detail People Counting Test Suite\\20240117_171026\\testCaseBinding"))
