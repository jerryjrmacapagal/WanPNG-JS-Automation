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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Account Settings"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Change password button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Change password button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Please enter your current password validation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Please enter your new password validation'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Please enter your current password validation'), GlobalVariable.emptyCurrentPasswordValidation)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Please enter your new password validation'), GlobalVariable.emptyNewPasswordValidation)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card'), 5)

WebUI.closeBrowser()