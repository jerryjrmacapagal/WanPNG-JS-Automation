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

//SCENARIO 1: Verify if Jobseeker can able to edit Date of birth 
WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Date of birth'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Date of birth'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/button_1989'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/button_1989'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/div_1985'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/div_13'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Date of birth'), 'value', '13 Aug 1985', 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Save changes button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card message'), 'Your personal information has been updated.')

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card close icon'))

//SCENARIO 2: Verify if Jobseeker can able to edit Sex
WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Sex'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Sex dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/div_Female'), 5)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/div_Female'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Save changes button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card'), 5)
//
WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card message'), 'Your personal information has been updated.')

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Save changes notif card close icon'))

//
WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Date of birth'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/button_1985'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/button_1985'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/div_1989'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/div_13'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Date of birth'), 'value', '13 Aug 1989', 5)

WebUI.click (findTestObject('Object Repository/Jobseeker Account Settings/Sex dropdown'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/div_Male'))

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Save changes button'))

WebUI.delay(3)

WebUI.closeBrowser()