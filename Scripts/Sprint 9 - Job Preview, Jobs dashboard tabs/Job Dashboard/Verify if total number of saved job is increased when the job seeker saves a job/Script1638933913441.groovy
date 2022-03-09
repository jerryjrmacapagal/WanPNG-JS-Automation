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

WebUI.callTestCase(findTestCase("Call Testcase/Search for a job"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Job Preview OR/First job card result'), 5)

WebUI.click(findTestObject('Job Preview OR/First job card result'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Save button'), 5)

WebUI.click(findTestObject('Job Preview OR/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Save job toast message'), 5)

WebUI.click(findTestObject('Job Preview OR/Job preview Close button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Jobs page tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Jobs page tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Saved jobs section'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobs page OR/Saved jobs tab total number'))

WebUI.closeBrowser()