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

CustomKeywords.'Login.GotoWanPNGpage'()

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Login Page/Log in title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Log in title'), GlobalVariable.logInLabel)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Email address label'), GlobalVariable.emailAddressLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Login Page/Email address textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Password label'), GlobalVariable.passwordLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Login Page/Password textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Forgot  password link'), GlobalVariable.forgotPasswordText)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Login Page/Login button'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Jobseeker Login Page/Login button'), 'value', GlobalVariable.logInLabel, 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Or text'), GlobalVariable.orText)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Login Page/Log in with Facebook link'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Log in with Facebook text'), GlobalVariable.loginWithFacebook)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Login Page/Facebook icon login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Login Page/Login with Google link'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Log in with Google text'), GlobalVariable.loginWithGoogle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Login Page/Google icon login'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Login Page/Dont have Wan PNG account yet'), GlobalVariable.noAccountText)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Login Page/Join now link'))

WebUI.closeBrowser()