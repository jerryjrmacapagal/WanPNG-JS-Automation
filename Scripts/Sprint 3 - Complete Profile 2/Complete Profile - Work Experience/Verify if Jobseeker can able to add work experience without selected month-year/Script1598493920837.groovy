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

//execute testcase
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add work experience button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add work experience button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Title Add work experience'), 5)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Job title textbox'), GlobalVariable.jobTitleValue)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Company name textbox'), GlobalVariable.companyName)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Location textbox'), GlobalVariable.locationValue)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Description textarea'), GlobalVariable.descriptionValue)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Started is required'), 5)

//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Started is required'), GlobalVariable.startedMonthValidation)

//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Year is required'), GlobalVariable.startedYearValidation)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Please input the correct month ended'), GlobalVariable.endedMonthValidation)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Ended year is required'), GlobalVariable.endedYearValidation)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'), 5)

WebUI.closeBrowser()