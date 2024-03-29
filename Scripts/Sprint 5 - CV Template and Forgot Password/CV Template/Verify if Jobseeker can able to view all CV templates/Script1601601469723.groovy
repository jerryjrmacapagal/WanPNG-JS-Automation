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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Share profile button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Share profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Templates button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Templates button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Choose a template title'), 5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Compact sample-image'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Compact sample-image'))

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Clean sample-image'))

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Modern sample-image'))

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Bold sample-image'))

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Corporate sample-image'))

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Standard sample-image'))

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Done button'))

WebUI.closeBrowser()