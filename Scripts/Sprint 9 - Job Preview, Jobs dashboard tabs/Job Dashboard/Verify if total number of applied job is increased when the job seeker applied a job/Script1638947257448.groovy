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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Saved jobs section'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Saved jobs First card'), 5)

WebUI.click(findTestObject('Object Repository/Saved jobs tab OR/Saved jobs First card'))

WebUI.waitForElementPresent(findTestObject('Jobs page OR/Job Preview OR/Employer Details/Apply now button'), 5)

WebUI.click(findTestObject('Jobs page OR/Job Preview OR/Employer Details/Apply now button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), GlobalVariable.applyMessage)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied job/Withdraw application button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Preview OR/Job preview Close button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied jobs tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Applied jobs tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied jobs title'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Applied jobs total number'), 5)

WebUI.closeBrowser()