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

//SCENARIO 1 - Verify cancel confirmation modal
WebUI.callTestCase(findTestCase("Call Testcase/Add education"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), GlobalVariable.space)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Cancel button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Discard changes modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard changes title'), GlobalVariable.discardChangesTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard changes subtitle'), GlobalVariable.discardChangesSubtitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/Discard cancel button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard cancel text'), GlobalVariable.cancelButton)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/Discard close icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard button'), GlobalVariable.discardButtonText)

//SCENARIO 2: Verify if Job Seeker can able to cancel adding education background
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Discard button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Education/Save button'), 5)

//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/h2_Greendale Community College'), )

WebUI.closeBrowser()