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

//Redirect to my profile
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//Execute testcase
WebUI.callTestCase(findTestCase("Call Testcase/Add education"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), Keys.chord(Keys.BACK_SPACE))

String[] school = findTestData("Universities").getAllData()

int randomSchool = new Random().nextInt(school.length + 2)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), findTestData("Universities").getValue("Universities", randomSchool))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Jobseekers Add Education/Save button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/h2_Hill Valley Academy'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/h2_Hill Valley Academy'), findTestData("Universities").getValue("Universities", randomSchool))

WebUI.closeBrowser()