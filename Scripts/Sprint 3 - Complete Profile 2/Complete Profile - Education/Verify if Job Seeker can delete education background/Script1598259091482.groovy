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
WebUI.callTestCase(findTestCase("Call Testcase/Add education"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Delete button'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Delete button'), GlobalVariable.deleteButton)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Delete button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Delete confirmation modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Delete education title'), GlobalVariable.deleteTitleEducation)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Delete education subtitle'), GlobalVariable.deleteSubtitle + GlobalVariable.space + GlobalVariable.variable + ".")

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/Delete modal icon'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Add Education/Delete Cancel button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Delete Cancel text'), GlobalVariable.cancelButton)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Add Education/Confirm Delete button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Confirm Delete text'), GlobalVariable.deleteButton)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Delete Cancel button'))

//SCENARIO 2: Verify if Job Seeker can delete education background	
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Delete button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Delete button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Confirm Delete button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Confirm Delete button'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Education/h2_Greendale Community College'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'), 5)

WebUI.closeBrowser()