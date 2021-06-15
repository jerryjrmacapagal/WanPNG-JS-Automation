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

//Redirect to my profile
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//Execute testcase
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/No training button'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/No training button'), GlobalVariable.noTrainingTextButton)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/No training button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/I dont have additional training text'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/I dont have additional training text'), GlobalVariable.noTrainingText)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Training/No training icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/This section will not be visible on your profile'), GlobalVariable.notVisibleOnProfileText)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers My Profile OR/Add training button'))

WebUI.closeBrowser()