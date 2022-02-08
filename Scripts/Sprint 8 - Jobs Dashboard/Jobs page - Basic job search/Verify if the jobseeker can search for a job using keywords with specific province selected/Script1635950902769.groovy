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

//Select Job classifications
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Engineering'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Engineering'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Engineering'))

WebUI.scrollToElement(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Mining, Resources and Energy'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Classifications/Job classification Mining, Resources and Energy'))

//Select Province
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces/Central'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Provinces/Central'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Search button'))

WebUI.closeBrowser()