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

//SCENARIO 1: Verify delete confirmation modal
WebUI.callTestCase(findTestCase("Call Testcase/Add Training"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/button Edit'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Edit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/Title Edit training'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Delete'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Delete confirmation modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/Delete this training title'), GlobalVariable.deleteTitleTraining)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Add Education/Delete Cancel button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Add Education/Confirm Delete button'))

//SCENARIO 2: Verify if the job seeker can delete a training background
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Confirm Delete button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Delete confirmation modal'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Confirm Delete button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Training section'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Training/button Edit'), 5)

WebUI.closeBrowser()