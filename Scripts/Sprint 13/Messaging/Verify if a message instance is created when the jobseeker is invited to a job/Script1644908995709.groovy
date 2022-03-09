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

WebUI.callTestCase(findTestCase("Call Testcase/Employer Invite Jobseeker"), [:])

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Messenger page"), [:])

//Message thread
WebUI.verifyElementPresent(findTestObject('Messenger Page OR/Pending Invite/Pending invite status Message thread'), 5)

WebUI.verifyElementText(findTestObject('Messenger Page OR/Pending Invite/Pending invite status Message thread'), GlobalVariable.pendingInvite)

WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Pending Invite/Message thread message'), "Gregor: I want to invite you.")

//Message Conversation
WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Pending Invite/Pending invite status Message thread'), GlobalVariable.pendingInvite)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Pending Invite/Message bubble'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Pending Invite/Message Bubble message'), "I want to invite you.")

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Pending Invite/Message bubble job preview'), 5)

WebUI.verifyElementText(findTestObject('Object Repo	sitory/Messenger Page OR/Pending Invite/View job posting text'), GlobalVariable.viewJobPosting)

WebUI.closeBrowser()