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

//SCENARIO 1 - Verify if the edit button is working
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.verifyElementVisible(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/delete skills button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Cancel button'))

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Cancel button'), GlobalVariable.cancelButton)

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'))

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'), GlobalVariable.saveButton)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Cancel button'))

//SCENARIO 2 - Verify if the jobseeker can add skills
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'CAD')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Basic'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Display CAD'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Display CAD'), 'CAD')

//SCENARIO 3 - Verify if jobseeker can remove skills
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/delete skills button'), 5)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/delete skills button'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Display CAD'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_Programming'), 5)

//SCENARIO 4 - Verify if the skills and level textbox would disable upon reaching the maximum skills
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Data Structures')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Intermediate'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Workflow Development')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Intermediate'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Computer Skills')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Intermediate'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Web Development')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Intermediate'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Lean Manufacturing')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Intermediate'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Programming Languages')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Intermediate'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'SolidWorks')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Intermediate'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Security')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Machine Learning')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Debugging')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'UX/UI')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Agile Development')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Prototyping')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Basic'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'STEM skills')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Basic'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Testing')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Basic'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Budgeting')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Basic'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 'Project Launch')

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Select level of experties'))

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Basic'))

WebUI.click(findTestObject('Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/maximum skills validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/maximum skills validation'), GlobalVariable.maximumSkillsValidation)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'))

WebUI.closeBrowser()