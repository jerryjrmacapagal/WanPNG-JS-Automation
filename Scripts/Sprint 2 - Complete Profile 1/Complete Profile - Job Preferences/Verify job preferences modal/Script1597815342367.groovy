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

//Redirect to my profile
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1 - Verify job preferences modal
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Job preferences title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Job preferences title'), GlobalVariable.jobPreferencesTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Job prefernces subtitle'), GlobalVariable.editJobPreferencesSubtitle)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Employment type label'), GlobalVariable.employmentTypeLabel)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Option Full Time'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Option Full Time'), GlobalVariable.fullTime)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Option Part Time'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Option Part Time'), GlobalVariable.partTime)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Option Contract'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Option Contract'), GlobalVariable.contract)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Option Freelance'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Option Freelance'), GlobalVariable.freelance)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Edit Job Preferences/Career level label'), 'title', 'Career level', 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Select career level'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Availability label'), GlobalVariable.availabilityLabel)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Availability textbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Close icon button'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Cancel text'), GlobalVariable.cancelButton)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Cancel button'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Save text'), GlobalVariable.saveButton)

WebUI.verifyElementClickable(findTestObject('Object Repository/Edit Job Preferences/Save button'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Cancel button'))

//SCENARIO 2 - Verify availability options
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Availability textbox'), 5)

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Availability textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/div_Immediately'), GlobalVariable.availableImmediately)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/div_2 weeks'), GlobalVariable.available2Weeks)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/div_4 weeks'), GlobalVariable.available4Weeks)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/div_8 weeks'), GlobalVariable.available8Weeks)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/div_12 weeks'), GlobalVariable.available12Weeks)

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Availability textbox'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Cancel button'))

//SCENARIO 3 - 
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Option Full Time'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Employment type validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Employment type validation'), GlobalVariable.employmentTypeValidation)

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Availability validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Availability validation'), GlobalVariable.availabilityValidation)

WebUI.closeBrowser()