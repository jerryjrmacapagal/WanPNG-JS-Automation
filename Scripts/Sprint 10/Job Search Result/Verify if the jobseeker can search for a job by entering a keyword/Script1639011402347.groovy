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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Jobs Page"), [:], FailureHandling.STOP_ON_FAILURE)

//Scenario 1: Verify  if the search button is disabled when there are no inputted data on the basic search
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Jobs page OR/Search button'))

//Scenario 2: Verify if auto-suggestion dropdown appears after typing 4 characters
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'))

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Jobs Search bar'), "Engi")

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Search suggestion dropdown'), 5)

//Scenario 3: Verify if the search button would enable if the jobseeker inputted a keyword
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Search button'))

//Scenario 4: Verify if the search button would enable if the jobseeker selected a job classification
WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Jobs Search bar'), Keys.chord(Keys.CONTROL + 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Jobs Search bar'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Jobs page OR/Search button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Engineering'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Engineering'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Search button'))

//Scenario 5: Verify if the search button would enable if the jobseeker selected a province
WebUI.click(findTestObject('Object Repository/Job search OR/Clear job classification'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces/Central'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces/Central'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Search button'))

//Scenario 6: Verify if the jobseeker can search for a job by entering a keyword
WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces/All provinces'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'))

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Jobs Search bar'), GlobalVariable.jobSearch)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Search button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search result container'), 5)

//Scenario 7: Verify if the search result would only display the first 10 jobs
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Search result counter'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Last job card'), 5)

//Scenario 8: Verify if the search result is sorted by relevance by default
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Sort by container'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Select Sort by option'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Select Sort by option'), GlobalVariable.relevanceOption)

//Scenario 9: Verify if the displayed result is correct upon searching for a job
WebUI.verifyTextPresent("Engineer", true)

WebUI.closeBrowser()