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

////Redirect to my profile
//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase("Call Testcase/Login Create Profile"), [:], FailureHandling.STOP_ON_FAILURE)

//execute testcase
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_Programming'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_Front-End Developer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_AutoCAD'))

//WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_Programming'), GlobalVariable.skillValueProgramming)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_Front-End Developer'), GlobalVariable.skillFrontEndDevelopment)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_AutoCAD'), GlobalVariable.skillValueAutoCAD)

WebUI.closeBrowser()