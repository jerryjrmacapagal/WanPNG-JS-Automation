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

WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Input New password'), 5)

WebUI.setText(findTestObject('Object Repository/Jobseeker Account Settings/Input Current password'), GlobalVariable.newPasswordValue)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Current password Show button'))

WebUI.setText(findTestObject('Object Repository/Jobseeker Account Settings/Input New password'), GlobalVariable.kcPassword)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/New password Show button'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Change password button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/Correct current password validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Correct current password validation'), GlobalVariable.correctCurrentPasswordValidation)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card'), 5)

WebUI.closeBrowser()