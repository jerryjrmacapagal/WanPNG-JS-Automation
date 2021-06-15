import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.STOP_ON_FAILURE
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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], STOP_ON_FAILURE)

//Personal Info
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Edit Personal Info/Save button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Edit Personal Info/Save button'))

//Summary
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Edit summary'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Edit summary'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Save button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Save button'))

//Work exp
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'))

//Education
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Save button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))

//Training
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/button Edit'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Edit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/button Save'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

//Skills
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'), 10)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'))

//Job preference
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Save button'), 10)

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Save button'))

WebUI.delay(7)

//Close browser
WebUI.closeBrowser()