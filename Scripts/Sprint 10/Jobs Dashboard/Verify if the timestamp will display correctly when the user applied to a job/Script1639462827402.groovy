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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Jobs Page"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Jobs page header title'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Save jobs OR/First saved job card'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Save jobs OR/First saved job card'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Employer Details/Apply now button'), 5)

WebUI.click(findTestObject('Job Preview OR/Employer Details/Apply now button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply job modal'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), GlobalVariable.applyMessage)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message'), GlobalVariable.appliedToastMessage)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/Employer Details/Timestamp'), 5)

//WebUI.verifyElementText(findTestObject('Job Preview OR/Employer Details/Timestamp'), GlobalVariable.justNow)

WebUI.verifyTextPresent(GlobalVariable.justNow, true)

WebUI.closeBrowser()