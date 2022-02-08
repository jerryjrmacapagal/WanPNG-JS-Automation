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

//Filter button
WebUI.waitForElementPresent(findTestObject("Jobs page OR/Filter button"), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter button'))

//Employment type
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 30 days option'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 30 days option'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Full Time'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Full Time'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Part Time'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Contract'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Freelance'))

//Career level
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Internship'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Internship'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Entry Level'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Mid-Senior Level'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Executive'))

//Pay period
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Monthly'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Monthly'))

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate text field'), GlobalVariable.minimumRateValue)

//Footer buttons
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'))

//Verify filters
WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter display Date posted'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter display Employment type'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter display Career level'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter display Pay period'), 5)

WebUI.closeBrowser()