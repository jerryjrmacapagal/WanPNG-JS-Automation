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

WebUI.callTestCase(findTestCase("Call Testcase/Apply for a job"), [:])

WebUI.callTestCase(findTestCase("Call Testcase/JS Withdraw Application"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Preview OR/Job preview Close button'), 5)

WebUI.click(findTestObject('Object Repository/Job Preview OR/Job preview Close button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Messenger tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Messenger tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Messenger page container'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messenger thread'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Active message thread'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Message Container more option'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Message Container more option'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Archive message'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Archive message'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Archive Message Modal/Archive message modal'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archive Message Modal/Archive button'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Archive Message Modal/Archive button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Archive Message Modal/Archive message toast message'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages more options dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages more options dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Show archived option'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Show archived option'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Active message archived'), 5)

WebUI.closeBrowser()