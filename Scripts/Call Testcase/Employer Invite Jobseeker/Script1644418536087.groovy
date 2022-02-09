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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase("Call Testcase/Employer Post a Job"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Candidate tab'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Candidate tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Candidate Page OR/Search bar'), 5)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Candidate Page OR/Search bar'), "Ife Ben")

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Candidate Page OR/Search button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Candidate Page OR/Search button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Candidate Page OR/First Card Candidate Search'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Candidate Page OR/First Card Candidate Search'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Invite button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Invite button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Invite modal'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Select Jobtitle dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/First option jobtitle'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/First option jobtitle'))

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Invitation Message textarea'), "I want to invite you.")

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Send invite button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Send invite button'))