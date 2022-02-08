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

//Redirect to my profile
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase("Call Testcase/Login Create Profile"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1 - Verify if the auto-suggestion dropdown would display upon searching for an existing skill
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/delete skills button'), 5)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/delete skills button'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Mech')

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Dropdown container suggestion'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Dropdown container suggestion'))

//SCENARIO 2 - Verify if the jobseeker can select suggested skills
WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Dropdown container suggestion'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_Mechanical Engineering'), 5)

WebUI.closeBrowser()