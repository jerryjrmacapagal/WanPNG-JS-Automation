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
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Employment type label'), 5)

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Option Part Time'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Option Contract'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Option Freelance'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Availability textbox'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/div_Immediately'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Job preferences section'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Display Full Time'), GlobalVariable.fullTime)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Display Part Time'), GlobalVariable.partTime)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Display Contract'), GlobalVariable.contract)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Display Freelance'), GlobalVariable.freelance)

WebUI.closeBrowser()