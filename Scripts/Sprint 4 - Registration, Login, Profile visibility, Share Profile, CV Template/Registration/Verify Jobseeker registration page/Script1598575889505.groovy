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

//Open WanPNG page
CustomKeywords.'Login.GotoWanPNGpage'()

//execute testcase
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Login Page/Join now link'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Login Page/Join now link'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Register/Register title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Register title'), GlobalVariable.registerTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/First name label'), GlobalVariable.firstNameLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Register/First name textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Last name label'), GlobalVariable.lastNameLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Register/Last name textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Email address label'), GlobalVariable.emailAddressLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Register/Email address textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Create password label'), GlobalVariable.createPasswordLabel)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Register/Password textbox'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Register/Show Hide Password button'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Jobseeker Register/Show Hide Password button'), 'value', GlobalVariable.showLabel, 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Terms and policy text'), GlobalVariable.termsAndPolicyLabel)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Register/Join now button'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Jobseeker Register/Join now button'), 'value', GlobalVariable.joinNowText, 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Or text'), GlobalVariable.orText)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Register/Sign up with Facebook link'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Sign up with Facebook text'), GlobalVariable.signUpFacebook)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Register/Facebook icon signup'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Register/Sign up with Google link'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Sign up with Google text'), GlobalVariable.signUpGoogle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Register/Google icon signup'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Register/Already have a Wan PNG account Log in'), GlobalVariable.redirectToLoginPageLabel)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Register/Log in link'))

WebUI.closeBrowser()
