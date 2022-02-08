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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Call Login TestCase
WebUI.callTestCase(findTestCase('Call Testcase/Jobseeker Register'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('Call Testcase/Login Create Profile'), [:], FailureHandling.STOP_ON_FAILURE)


//Verify validation messages
WebUI.doubleClick(findTestObject('Object Repository/Jobseekers Personal Info OR/First name textbox'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/First name textbox'), Keys.chord(Keys.BACK_SPACE))

WebUI.doubleClick(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name textbox'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name textbox'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Personal info Next button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/First name validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/First name validation'), GlobalVariable.firstNameValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name validation'), GlobalVariable.lastNameValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Mobile number validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Mobile number validation'), GlobalVariable.mobileValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Province validation message'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Province validation message'), GlobalVariable.provinceValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/City or village validation message'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/City or village validation message'), GlobalVariable.villageValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Date of birth validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Date of birth validation'), GlobalVariable.birthdateValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Sex validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Sex validation'), GlobalVariable.sexValidationMessage)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences title'), 5)

WebUI.closeBrowser()