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

//Call Login Testcase
WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Register"), [:], FailureHandling.STOP_ON_FAILURE)

//Input Data
WebUI.callTestCase(findTestCase("Call Testcase/Input data personal information"), [:], FailureHandling.STOP_ON_FAILURE)

//Redirect to jobseeker preferences
WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Personal info Next button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences title'), GlobalVariable.jobPreferencesTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences subtitle'), GlobalVariable.jobPreferencesSubtitle)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Job Preferences OR/Careel Level label'), GlobalVariable.careerLevelLabel)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Job Preferences OR/Employment type label'), GlobalVariable.employmentTypeLabel)

WebUI.verifyElementClickable(findTestObject('Object Repository/Job Seeker Job Preferences OR/Career level dropdown'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Job Seeker Job Preferences OR/Employment type dropdown'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Back button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Back button'))

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Back text'), GlobalVariable.backButton)

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Back icon'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Next button'))

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Next text'), GlobalVariable.nextButton)

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences Next icon'))

WebUI.closeBrowser()