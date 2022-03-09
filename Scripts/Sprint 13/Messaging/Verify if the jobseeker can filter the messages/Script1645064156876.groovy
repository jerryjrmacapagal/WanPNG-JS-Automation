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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Messenger page"), [:])

//SCENARIO 1: Verify if the jobseeker can filter the messages by Applications
WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages filter options/Applications'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages filter options/Applications'))

WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'), GlobalVariable.applications)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messenger thread'), 5)

//SCENARIO 2: Verify if the jobseeker can filter the messages by Invitations
WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages filter options/Invitations'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages filter options/Invitations'))

WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'), GlobalVariable.invitations)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messenger thread'), 5)

//SCENARIO 3: Verify if the jobseeker can filter the messages by All messages
WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages filter options/All messages'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages filter options/All messages'))

WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'), GlobalVariable.allMessages)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messenger thread'), 5)

WebUI.closeBrowser()