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

//CustomKeywords.'Login.GotoWanPNGpage'()
//
//CustomKeywords.'Login.loginAccount'()

//WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'))

//SCENARIO 1: Verify if jobseeker can able to change visibility from Standard (Default) to Limited
WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility modal'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Limited title'))

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Save button'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Display profile visibility title'), GlobalVariable.limitedVisibilityTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Display profile visibility description'), GlobalVariable.limitedVisibilityContent)

//SCENARIO 2: Verify if jobseeker can able to change visibility from Standard (Default) to Hidden
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility modal'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Hidden'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseekers Profile Visibility/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Save button'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Display profile visibility title'), GlobalVariable.hiddenVisbilityTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Display profile visibility description'), GlobalVariable.hiddenVisibilityContent)

//WebUI.closeBrowser()