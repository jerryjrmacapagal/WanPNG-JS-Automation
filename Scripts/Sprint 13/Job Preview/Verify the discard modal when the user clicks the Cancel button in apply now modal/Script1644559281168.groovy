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

WebUI.callTestCase(findTestCase("Call Testcase/Search for a job"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Job search OR/First card job search result'), 5)

WebUI.click(findTestObject('Object Repository/Job search OR/First card job search result'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Job posting container'), 5)

//SCENARIO 1: Verify if the discard modal will appear when the user didn't input anything in the text field
WebUI.verifyElementPresent(findTestObject('Job Preview OR/Employer Details/Apply now button'), 5)

WebUI.click(findTestObject('Job Preview OR/Employer Details/Apply now button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard modal'), 5)

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply job modal'))

//SCENARIO 2: Verify the discard modal when the user clicks the cancel button on the confirmation modal
WebUI.verifyElementPresent(findTestObject('Job Preview OR/Employer Details/Apply now button'), 5)

WebUI.click(findTestObject('Job Preview OR/Employer Details/Apply now button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), GlobalVariable.applyMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard changes title'), GlobalVariable.discardApplication)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard changes description'), GlobalVariable.discardApplicationDescription)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard Close modal button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard Cancel button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard changes button'))

//SCENARIO 3: Verify if the discard modal will close when the user clicks the "Cancel" button
WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard Cancel button'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard modal'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply job modal'))

//SCENARIO 4: Verify if the discard modal will disappear when the user clicks the "Discard" button
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard modal'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard changes button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard changes button'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/Discard changes modal/Discard modal'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply job modal'))

WebUI.verifyElementVisible(findTestObject('Job Preview OR/Employer Details/Apply now button'))

WebUI.closeBrowser()