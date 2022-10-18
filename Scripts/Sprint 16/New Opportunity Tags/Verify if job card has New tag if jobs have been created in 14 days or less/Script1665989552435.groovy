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

//WebUI.callTestCase(findTestCase("Call Testcase/Employer Post a Job"), [:])

//SCENARIO 1: Verify if job card has "New" tag when job is created in 14 days or less

WebUI.callTestCase(findTestCase("Call Testcase/Search for a job"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/New tag'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Job search OR/New tag'), GlobalVariable.newText)

//SCENARIO 2: Verify if "New" tag is display when published date is more than 14 days

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Input Keyword'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Input Keyword'), Keys.chord(Keys.CONTROL + "a"))

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Input Keyword'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Input Keyword'), "Foxmedia Corporation")

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Search button'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Job search OR/New tag'), 5)

WebUI.closeBrowser()