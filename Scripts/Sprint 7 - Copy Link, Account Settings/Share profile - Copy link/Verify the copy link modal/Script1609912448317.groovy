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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Share Profile"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1: Verify the copy link modal
WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Jobseekers CV Template/Copy link button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Copy link button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Copy link OR/Copy link modal'))

WebUI.verifyElementText(findTestObject('Object Repository/Copy link OR/Copy link title'), GlobalVariable.copyLinkTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Copy link OR/Copy link subtitle'), GlobalVariable.copyLinkSubtitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Copy link OR/Copy link close icon'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Copy link OR/input_Use this link to share your profile._copy'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Copy link OR/Copy link Copy button'))

//SCENARIO 2: Verify if the Copy link modal would close after clicking the 'X' icon
WebUI.click(findTestObject('Object Repository/Copy link OR/Copy link close icon'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Copy link OR/Copy link modal'))

//SCENARIO 3: Verify if the copy button is working
WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Copy link button'))

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Copy link button'))

WebUI.click(findTestObject('Object Repository/Copy link OR/Copy link Copy button'))

def JobseekerUrl = WebUI.getAttribute(findTestObject('Object Repository/Copy link OR/input_Use this link to share your profile._copy'), 'value')

WebUI.navigateToUrl(JobseekerUrl)

WebUI.delay(5)

WebUI.closeBrowser()