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

//Redirect ot my profile
WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//execute testcase
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Edit Job Preferences/Select career level'), 5)
	
WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Select career level'))

WebUI.click(findTestObject('Object Repository/Job Seeker Job Preferences OR/div_Entry-level'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Option Freelance'))

WebUI.click(findTestObject('Object Repository/Job Seeker Job Preferences OR/Availability dropdown'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/div_Immediately'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Save button'))

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.mouseOver(findTestObject('Object Repository/Job Seeker Job Preferences OR/Availability dropdown'))

WebUI.click(findTestObject('Object Repository/Job Seeker Job Preferences OR/Clear Availability'))

WebUI.click(findTestObject('Object Repository/Edit Job Preferences/Save button'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Job Preferences/Availability Not specified'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Availability Not specified'), "Not specified")

//WebUI.verifyElementText(findTestObject('Object Repository/Edit Job Preferences/Availability validation'), GlobalVariable.availabilityValidation)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Edit Job Preferences/Save button'), 5)

WebUI.closeBrowser()