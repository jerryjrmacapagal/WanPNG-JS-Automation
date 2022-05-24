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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase("Call Testcase/Search for a job"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Save search link'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Job search OR/Save search link'), "Save search")

WebUI.click(findTestObject('Object Repository/Job search OR/Save search link'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job search OR/Save search toast message'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches toast message'), 5)

//SCENARIO 2: Verify if jobseeker is redirected to Managed saved searches modal after clicking the Manage saved searches link on the toast message
WebUI.click(findTestObject('Object Repository/Job search OR/Manage saved searches toast message'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches modal'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches modal title'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches modal subtitle'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches modal close button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches delete search'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Saved search content'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches cancel button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Job search OR/Manage saved searches Save button'), 5)

WebUI.closeBrowser()