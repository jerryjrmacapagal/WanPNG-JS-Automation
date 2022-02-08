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

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Saved jobs First card'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Employer logo'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Job title'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Company name'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Province and preferences container'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Province'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Career level'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Employment type'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Date updated'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Save button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Saved jobs tab OR/Save icon'), 5)

WebUI.closeBrowser()