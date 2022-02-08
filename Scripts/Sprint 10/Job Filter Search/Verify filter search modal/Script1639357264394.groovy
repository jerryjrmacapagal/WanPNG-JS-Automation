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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal title'), GlobalVariable.filterTitle)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Date posted label'), 5)

//Date Posted
WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Date posted label'), GlobalVariable.datePostedLabel)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Employment type label'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Anytime option'), GlobalVariable.anytimeOption)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 24 hrs option'), GlobalVariable.last24hrs)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 7 days option'), GlobalVariable.last7days)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Last 30 days option'), GlobalVariable.last30days)

//Employment type
WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Employment type label'), GlobalVariable.employmentTypeLabel)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Full Time'), GlobalVariable.fullTime)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Part Time'), GlobalVariable.partTime)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Contract'), GlobalVariable.contract)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Freelance'), GlobalVariable.freelance)

//Career level
WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Internship'), GlobalVariable.internship)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Entry Level'), GlobalVariable.entryLevel)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Mid-Senior Level'), GlobalVariable.midSeniorLevel)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Executive'), GlobalVariable.executive)

//Pay period
WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period label'), GlobalVariable.payPeriodLabel)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Hourly'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Hourly'), GlobalVariable.hourly)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Weekly'), GlobalVariable.weekly)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Bi-weekly'), GlobalVariable.biweekly)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Monthly'), GlobalVariable.monthly)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Annually'), GlobalVariable.annually)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate label'), GlobalVariable.minimumRateLabel)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate text field'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter note'), GlobalVariable.filterNoteText)

//Buttons
WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Filter Options/Clear button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Clear button'), GlobalVariable.clear)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'), GlobalVariable.applyFilterButton)

WebUI.closeBrowser()