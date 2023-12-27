import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class NormalTest {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Keyword
	def signIn(String username, String password) {
		TestObject inputUsername = findTestObject('Object Repository/usernameField')
		TestObject inputPassword = findTestObject('Object Repository/passwordField')
		TestObject buttonSignIn = findTestObject('Object Repository/loginButton')

		WebUI.setText(inputUsername, username)
		WebUI.setText(inputPassword, password)
		WebUI.click(buttonSignIn)
	}

	@Given("I am on the Sign In page")
	def givenIAmOnSignInPage() {
		WebUI.openBrowser('http://103.180.125.58:8080')
	}

	@When("I enter the username {string} and password {string}")
	def whenIEnterUsernameAndPassword(String username, String password) {
		signIn(username, password)
	}

	@And("I click on the Sign In button")
	def andIClickOnSignInButton() {
		TestObject buttonSignIn = findTestObject('Object Repository/loginButton')
		WebUI.click(buttonSignIn)
	}

	@Then("I should be logged in successfully")
	def thenIShouldBeLoggedInSuccessfully() {
		// Add necessary verification steps for successful login
	}
}