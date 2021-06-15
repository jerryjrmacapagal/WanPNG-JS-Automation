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
//WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//Execute testcase

//SCENARIO 1 - Verify if Job Seeker can able to cancel adding a summary using 'Cancel' Button
//WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add Summary button'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), 5)
//
String[] summary = findTestData('Geochemist Summary').getAllData()

int randomSummary = new Random().nextInt(summary.length + 1)
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), findTestData("Senior Software Engineer Summary").getValue("Software Engineer Summary", randomSummary))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Cancel button'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Discard Changes Discard button'))
//
//WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), 5)
//
//WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Summary/Add summary title'), 5)

//SCENARIO 2 - Verify if Job Seeker can able to add summary with more than 500 characters
//WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add Summary button'))
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), GlobalVariable.summaryLimit)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Save button'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Summary validation message'), 5)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Summary/Summary validation message'), GlobalVariable.summaryValidationMessage)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Cancel button'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Discard Changes Discard button'))

//SCENARIO 3 - Verify if Job Seeker can able to add a summary with 500 characters using 'Save' Button
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add Summary button'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), findTestData("Geochemist Summary").getValue("Summary", randomSummary))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Summary content'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Summary/Summary content'), findTestData("Geochemist Summary").getValue("Summary", randomSummary))

//WebUI.closeBrowser()