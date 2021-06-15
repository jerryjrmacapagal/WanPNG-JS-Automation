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

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add Summary button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add Summary button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), 5)

String[] summary = findTestData("Summary").getAllData()

int randomSummary = new Random().nextInt(summary.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Summary/Summary Textbox'), findTestData("Summary").getValue("Summary", randomSummary))

//WebUI.click(findTestObject('Object Repository/Jobseekers Add Summary/Save button'))