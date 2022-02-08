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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), 5)

//Search company name
WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), GlobalVariable.searchCompany)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Accounting'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Accounting'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'))

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/Enga'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces/Morobe'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces/Morobe'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Search button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search result container'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Search result counter'), 5)

//Update search
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), 'Engineer')

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Accounting'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Accounting'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Engineering'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Engineering'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'))

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/Eastern Highlands'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/East Sepik'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/East New Britain'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/Chimbu'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/Central'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/Bougainville Region'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Provinces/All provinces'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces/All provinces'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces/All provinces'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Search button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search result container'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Search result counter'), 5)

WebUI.closeBrowser()