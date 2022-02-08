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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

def newfirstname = RandomStringUtils.randomAlphabetic(5)

//Call login
//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase("Call Testcase/Login Create Profile"), [:], FailureHandling.STOP_ON_FAILURE)

//execute testcase
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Personal Info OR/First name textbox'), newfirstname)

WebUI.click(findTestObject('Object Repository/Jobseekers Edit Personal Info/Cancel button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Edit Personal Info/Discard changes modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Edit Personal Info/Discard changes title'), GlobalVariable.discardChangesTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Edit Personal Info/Discard changes subtitle'), GlobalVariable.discardChangesSubtitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Edit Personal Info/Discard Cancel button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Edit Personal Info/Discard changes button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Edit Personal Info/Discard Cancel text'), GlobalVariable.cancelButton)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Edit Personal Info/Discard button text'), GlobalVariable.discardButtonText)

WebUI.closeBrowser()