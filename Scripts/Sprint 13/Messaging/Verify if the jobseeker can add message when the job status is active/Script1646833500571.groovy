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

//SCENARIO 1: Verify if the invited applicant can message the employer
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Jobs Page"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/First card Job invitation'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/First card Job invitation'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Job Preview OR/Job posting container'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job Preview OR/Message button'), 5)

WebUI.click(findTestObject('Object Repository/Job Preview OR/Message button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Pending Invite/Pending invite status Message conversation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Pending Invite/Pending invite status Message conversation'), "Pending Invite")

WebUI.focus(findTestObject('Object Repository/Messenger Page OR/Messenger textarea'))

WebUI.setText(findTestObject('Object Repository/Messenger Page OR/Messenger textarea'), GlobalVariable.thankyouInviteMessage)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/Messenger Page OR/Send button'))

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Send button'))

WebUI.verifyTextPresent(GlobalVariable.thankyouInviteMessage, true)

WebUI.closeBrowser()