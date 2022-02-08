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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/First job card result'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Preview OR/First job card result'))

WebUI.delay(5)

//Verify employer details
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Employer Details/Location display'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Employer Details/Career-level dsiplay'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Employer Details/Employment type display'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Employer Details/Job classification display'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Employer Details/Publisher display'), 5)

//Buttons
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Save button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Save button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Save button'), GlobalVariable.saveButton)

WebUI.verifyElementPresent(findTestObject('Jobs page OR/Job Preview OR/Employer Details/Apply now button'), 5)

WebUI.verifyElementClickable(findTestObject('Jobs page OR/Job Preview OR/Employer Details/Apply now button'))

WebUI.verifyElementText(findTestObject('Jobs page OR/Job Preview OR/Employer Details/Apply now button'), GlobalVariable.applyButton)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/View company profile button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Job Preview OR/View company profile button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Job Preview OR/View company profile button'), GlobalVariable.viewCompanyProfile)

//Verify Job details
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Job Details/Job summary section'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Job Details/Job summary title'), GlobalVariable.jobSummaryTitle)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Job Details/Job description section'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Job Details/Job description title'), GlobalVariable.jobDescriptionTitle)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Job Details/Salary sections'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Job Details/Salary title'), GlobalVariable.salaryTitle)

WebUI.closeBrowser()