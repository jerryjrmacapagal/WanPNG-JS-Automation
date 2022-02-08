import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

import internal.GlobalVariable


public class InputDataRegistration {

	def firstName = 'Jerry'

	def lastName = 'Macapagal'

	def emailAddress = (GlobalVariable.kcEmailAddress + firstName + "+" + RandomStringUtils.randomAlphanumeric(4)) + GlobalVariable.kcDomain

	@Keyword
	def register() {

		WebUI.delay(3)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Register/Join now link'), 5)

		WebUI.click(findTestObject('Object Repository/Jobseeker Register/Join now link'))

		WebUI.setText(findTestObject('Object Repository/Jobseeker Register/First name textbox'), firstName)

		WebUI.setText(findTestObject('Object Repository/Jobseeker Register/Last name textbox'), lastName)

		WebUI.setText(findTestObject('Object Repository/Jobseeker Register/Email address textbox'), emailAddress)

		WebUI.setText(findTestObject('Object Repository/Jobseeker Register/Password textbox'), GlobalVariable.kcPassword)
	}

	//	GlobalVariable.registeredEmail1Address = emailAddress
}
