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

WebUI.openBrowser(GlobalVariable.Dev)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Login Page/Forgot  password link'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Login Page/Forgot  password link'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Forgot password page container'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Reset your password header'), GlobalVariable.resetPasswordHeader)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Reset password subtitle'), GlobalVariable.resetPasswordSubtitle)

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Email address label'), GlobalVariable.emailAddressLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Email address textbox'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Reset password button'))

WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Return to Log in text'), GlobalVariable.returnToLogin)

WebUI.verifyElementClickable(findTestObject('Object Repository/Job Seeker Forgot Password Page OR/Return to log in link'))

WebUI.closeBrowser()