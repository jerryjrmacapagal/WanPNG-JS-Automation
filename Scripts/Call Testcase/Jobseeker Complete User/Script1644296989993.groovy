import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.STOP_ON_FAILURE
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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase("Call Testcase/Add summary"), [:], STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Save button'))

WebUI.scrollToElement(findTestObject('Object Repository/Jobseekers My Profile OR/Work experience section'), 5)

WebUI.callTestCase(findTestCase("Call Testcase/Add work experience"), [:], STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'))

WebUI.scrollToElement(findTestObject('Object Repository/Jobseekers My Profile OR/Education section'), 5)

WebUI.callTestCase(findTestCase("Call Testcase/Add education"), [:], STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))

WebUI.scrollToElement(findTestObject('Object Repository/Jobseekers My Profile OR/Training section'), 5)

WebUI.callTestCase(findTestCase("Call Testcase/Add Training"), [:], STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Training/button Save'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.callTestCase(findTestCase("Call Testcase/Add affiliations"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseeker Add Affiliation/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Add Affiliation/Save button'))

WebUI.delay(5)

WebUI.closeBrowser()