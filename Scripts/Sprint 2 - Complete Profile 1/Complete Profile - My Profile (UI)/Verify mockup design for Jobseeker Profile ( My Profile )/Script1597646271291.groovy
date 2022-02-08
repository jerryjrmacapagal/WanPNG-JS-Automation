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

//Call login test case
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//Verify my profile
WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/span_My profile'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Share profile button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Share profile button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Personal information section'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Percentage section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Percentage progress bar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Summary section'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Summary title'), GlobalVariable.summaryTitle)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Add Summary button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Work experience section'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Work experience title'), GlobalVariable.workExperienceTitle)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Add work experience button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/No work experience button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Education section'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Education title'), GlobalVariable.educationTitle)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Training section'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Training title'), GlobalVariable.trainingTitle)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Add training button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/No training button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Affiliation section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Affiliation title'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Skills competencies section'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Skills  competencies title'), GlobalVariable.skillsAndCompetenciesTitle)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Job preferences section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Job preferences icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Job preferences title'), GlobalVariable.jobPreferencesTitle)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Edit job preferences button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Profile visibility section'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Profile visibility title'), GlobalVariable.profileVisibilityTitle)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'))

WebUI.closeBrowser()