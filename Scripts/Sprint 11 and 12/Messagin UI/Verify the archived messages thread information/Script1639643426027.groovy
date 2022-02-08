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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper

//CustomKeywords.'Login.GotoWanPNGpage'()
//
//CustomKeywords.'Login.MessengerEmptyState'()

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:])

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Messenger tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Messenger tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Messages more options dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Messages more options dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Show archived option'), 5)

WebUI.click(findTestObject('Object Repository/Messenger Page OR/Show archived option'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Archived title'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Active message archived'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Company logo'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Company name'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Job title'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Archived message converation'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Archive application status'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Archived Messages OR/Archived timestamp'), 5)

WebUI.closeBrowser()