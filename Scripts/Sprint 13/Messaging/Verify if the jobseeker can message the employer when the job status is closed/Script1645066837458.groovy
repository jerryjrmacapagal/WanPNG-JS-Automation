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

//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Messenger page"), [:])
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages title'), 5)

//SCENARIO 1: Verify if the jobseeker can add messages if the job status is "Not Selected"
//SCENARIO 2: Verify if the jobseeker can add messages if the job status is "Withdrawn"
//SCENARIO 3: Verify if the jobseeker can add messages  when withdrawing from the application
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Jobs Page"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Jobs page header title'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/First job card'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/First job card'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Job posting container'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/Job preview application status'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/Withdraw application button'), 5)

WebUI.click(findTestObject('Job Preview OR/Withdraw application button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Withdraw application modal/Withdraw modal'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Withdraw application modal/Withdraw message'), GlobalVariable.withdrawMessage)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Withdraw application modal/Withdraw button'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Withdraw application modal/Withdraw button'))

WebUI.verifyElementNotPresent(findTestObject('Job Preview OR/Message button'), 5)

//SCENARIO 4: Verify if the jobseeker can add messages if the job status is "Hired"
WebUI.closeBrowser()