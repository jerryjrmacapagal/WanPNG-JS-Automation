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

//Call login
WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Register"), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase("Call Testcase/Login Create Profile"), [:], FailureHandling.STOP_ON_FAILURE)

//input data step 1
WebUI.callTestCase(findTestCase("Call Testcase/Input data personal information"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Personal info Next button'))

WebUI.callTestCase(findTestCase("Call Testcase/Input job preferences"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Next button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skills and competencies title'), 5)

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), GlobalVariable.skillValueProgramming)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/Create profile Add button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Advanced skills title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Advanced skills title'), GlobalVariable.advancedSkillsLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Display Skill Programming'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_closeIcon'))

WebUI.closeBrowser()