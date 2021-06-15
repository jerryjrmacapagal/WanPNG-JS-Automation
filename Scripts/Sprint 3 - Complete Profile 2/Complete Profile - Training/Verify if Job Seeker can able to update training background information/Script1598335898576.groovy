import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.RenderingHints.Key

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

//Redirect to my profile
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1: Verify discard changes modal
WebUI.callTestCase(findTestCase("Call Testcase/Add Training"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/button Edit'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Edit'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/Title Edit training'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), GlobalVariable.space)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Cancel'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Discard changes modal'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/Discard changes title'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/Discard changes subtitle'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Add Education/Discard cancel button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

//SCENARIO 2: Verify if Job Seeker can able to update training background information
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/Display Training Background'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Edit'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), Keys.chord(Keys.BACK_SPACE))

String[] university = findTestData("Universities").getAllData()

int randomUniversity = new Random().nextInt(university.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), findTestData("Universities").getValue("Universities", randomUniversity))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training title textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training title textbox'), Keys.chord(Keys.BACK_SPACE))

String[] training = findTestData("TrainingTitle").getAllData()

int randomTraining = new Random().nextInt(training.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training title textbox'), findTestData("TrainingTitle").getValue("Training Titles", randomUniversity))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.waitForElementPresent(findTestObject('Jobseekers Add Training/Updated university'), 5)

WebUI.verifyElementText(findTestObject('Jobseekers Add Training/Updated university'), findTestData("Universities").getValue("Universities", randomUniversity))

WebUI.verifyElementText(findTestObject('Jobseekers Add Training/Updated training title'), findTestData("TrainingTitle").getValue("Training Titles", randomUniversity))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Training/h2_Pendleton State University'), 5)

WebUI.closeBrowser()