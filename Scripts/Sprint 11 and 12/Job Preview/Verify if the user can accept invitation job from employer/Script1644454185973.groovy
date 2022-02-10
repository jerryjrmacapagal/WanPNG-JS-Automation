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

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Jobs page tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Jobs page tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/First card Job invitation'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/First card Job invitation'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Invitation Banner'), 5)

//SCENARIO 1: Verify the Accept & apply modal
WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept button'))

WebUI.waitForElementPresent(findTestObject('Jobs page OR/Invited to apply Section/Accept invitation modal OR/Accept invitation modal'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Close button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Accept invitation title'), GlobalVariable.acceptInvitationTitle)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Accept invitation description'), 5)

WebUI.verifyTextPresent(GlobalVariable.acceptInvitationDescription, true)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Message to text'), GlobalVariable.messageToText)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Employer name'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Message textarea'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Note tag container'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Note tag description'), GlobalVariable.acceptInviteNoteTagDescription)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Apply button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Cancel button'), GlobalVariable.cancelButton)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Apply button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Apply button'), GlobalVariable.applyText)

//SCENARIO 2: 
WebUI.setText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Message textarea'), GlobalVariable.applyInviteMessage)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Apply button'))

WebUI.waitForElementPresent(findTestObject('Jobs page OR/Invited to apply Section/Accept invitation modal OR/Toast message'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Accept invitation modal OR/Apply toast message description'), GlobalVariable.applyToastMessageDescription)

WebUI.verifyElementPresent(findTestObject('Jobs page OR/Invited to apply Section/Accept invitation modal OR/Toast message close button'), 5)

WebUI.click(findTestObject('Jobs page OR/Invited to apply Section/Accept invitation modal OR/Toast message close button'))

WebUI.closeBrowser()