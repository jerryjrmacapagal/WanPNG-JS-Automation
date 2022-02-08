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

//Call Login TC
WebUI.callTestCase(findTestCase('Call Testcase/Jobseeker Register'), [:], FailureHandling.STOP_ON_FAILURE)

//Call Input data TC
WebUI.callTestCase(findTestCase('Call Testcase/Input data personal information'),[:], FailureHandling.STOP_ON_FAILURE)

//Clear firstname
WebUI.doubleClick(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name textbox'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name textbox'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Personal info Next button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name validation'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name validation'), GlobalVariable.lastNameValidationMessage)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Job Seeker Job Preferences OR/Job preferences title'), 5)

WebUI.closeBrowser()