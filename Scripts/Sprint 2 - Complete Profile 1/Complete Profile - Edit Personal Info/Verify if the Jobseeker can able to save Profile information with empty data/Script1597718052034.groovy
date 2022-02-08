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
import org.openqa.selenium.Keys as Keys

//Redirect to My profile
//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase("Call Testcase/Login Create Profile"), [:], FailureHandling.STOP_ON_FAILURE)
//Execute test case
WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Edit Personal Info/Edit Personal information title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Edit Personal Info/Edit Personal information title'), GlobalVariable.editPersonalInfoTitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Edit Personal Info/Update Photo Section'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Edit Personal Info/Update Photo button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Edit Personal Info/Update Photo text'),  GlobalVariable.updatePhotoText)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/First name textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/First name textbox'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name textbox'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/Jobseekers Edit Personal Info/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/First name validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/First name validation'), GlobalVariable.firstNameValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name validation'), GlobalVariable.lastNameValidationMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Edit Personal Info/Edit Personal information title'), 5)

WebUI.closeBrowser()