import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.RenderingHints.Key

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

//Redirect to my profile
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//execute test case
//should have inputted summary
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add Summary button'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), GlobalVariable.summaryValue)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Save button'))

//update summary
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Edit summary'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Edit summary'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Edit summary title'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), GlobalVariable.updateSummaryValue)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Save button'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Jobseekers Add Summary/Edit summary title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Summary/Summary content'), GlobalVariable.updateSummaryValue)

WebUI.closeBrowser()