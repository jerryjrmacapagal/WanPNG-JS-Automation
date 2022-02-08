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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal title'), GlobalVariable.filterTitle)

//Date posted options
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Date posted label'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Date posted label'), GlobalVariable.datePostedLabel)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Anytime option'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 24 hrs option'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 7 days option'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 30 days option'), 5)

//Employment type options
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Employment type label'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Employment type label'), GlobalVariable.employmentTypeLabel)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Full Time'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Full Time'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Part Time'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Contract'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Freelance'), 5)

//Career level options
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Career level label'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Career level label'), "Career level")

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Internship'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Entry Level'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Mid-Senior Level'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Executive'), 5)

//Pay period
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Pay period label'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Pay period label'), GlobalVariable.payPeriodLabel)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Hourly'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Weekly'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Bi-weekly'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Monthly'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Annually'), 5)

//Minimum rate
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Minimum rate label'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Minimum rate label'), GlobalVariable.minimumRateLabel)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter note'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter note icon'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter note text'), GlobalVariable.filterNoteText)

//Buttons
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Clear button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Filter Options/Clear button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'))

WebUI.closeBrowser()