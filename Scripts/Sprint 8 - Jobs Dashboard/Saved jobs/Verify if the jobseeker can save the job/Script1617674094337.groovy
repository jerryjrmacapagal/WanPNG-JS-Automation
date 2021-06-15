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

WebUI.callTestCase(findTestCase('Sprint 8 - Jobs Dashboard/Jobs page/Verify if the jobseeker can search for jobs by Job title'), [:], STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Save jobs OR/First card Job search'), 10)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Save jobs OR/First card Job search'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Save button'), 10)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Notification card'), 10)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Notification card'), "Added to your Saved jobs.")

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Notification card close'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Notification card close'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Saved button text'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Saved button text'), "Saved")

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Bookmark icon highlight'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Saved button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Notification card Remove save'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Save jobs OR/Notification card Remove save'), "Removed from your Saved jobs.")

WebUI.closeBrowser()