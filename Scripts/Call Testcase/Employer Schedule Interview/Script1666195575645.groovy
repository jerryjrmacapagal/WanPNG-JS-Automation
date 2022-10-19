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

//Employer Invite JS
WebUI.callTestCase(findTestCase("Call Testcase/Employer Invite Jobseeker"), [:])

//JS accept invitation
WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker login"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page OR/Notification tab'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page OR/Notification tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page OR/First Notification Card'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page OR/First Notification Card'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Preview OR/Accept and apply'), 5)

WebUI.click(findTestObject('Object Repository/Job Preview OR/Accept and apply'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Message textarea'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Message textarea'), "Thank you!")

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Accept Apply button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Accept Apply button'))

//Employer Schedule interview
WebUI.callTestCase(findTestCase("Call Testcase/Employer Login"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/Notification tab'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/Notification tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/First notification'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/First notification'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Schedule Interview/Interview button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Schedule Interview/Interview button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Invited candidates tab/Interview Title textbox'), 5)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Invited candidates tab/Interview Title textbox'), GlobalVariable.interviewTitle)

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Schedule Interview/Interview instruction'), 5)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Schedule Interview/Interview instruction'), GlobalVariable.interviewDescription)

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Schedule Interview/Send invite button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Schedule Interview/Send invite button'))