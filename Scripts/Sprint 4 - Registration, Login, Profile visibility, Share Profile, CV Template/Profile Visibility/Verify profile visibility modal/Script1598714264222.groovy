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

CustomKeywords.'Login.loginAccount'()

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Profile visibility section'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility title'), GlobalVariable.profileVisibilityTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility subtitle'), GlobalVariable.profileVisibilitySubtitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Standard (Default) title'), GlobalVariable.standardDefaultTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Standard content'), GlobalVariable.standardVisibilityContent)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Limited title'), GlobalVariable.limitedVisibilityTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Limited content'), GlobalVariable.limitedVisibilityContent)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Hidden'), GlobalVariable.hiddenVisbilityTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Hidden content'), GlobalVariable.hiddenVisibilityContent)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Profile Visibility/Cancel button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/span_Cancel'), GlobalVariable.cancelButton)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Profile Visibility/Save button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Profile Visibility/span_Save'), GlobalVariable.saveButton)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility icon close'))

WebUI.closeBrowser()