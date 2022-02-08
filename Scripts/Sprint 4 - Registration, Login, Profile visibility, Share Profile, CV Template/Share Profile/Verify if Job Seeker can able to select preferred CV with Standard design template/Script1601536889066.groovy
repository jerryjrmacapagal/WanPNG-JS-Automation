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
//CustomKeywords.'Login.GotoWanPNGpage'()
//CustomKeywords.'Login.loginAccount'()

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker login"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'))

//WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Templates button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/CV Template Section'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Choose a template title'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Standard (Default) title'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Standard (Default) title'), GlobalVariable.standardTemplate)

WebUI.verifyElementVisible(findTestObject('Jobseekers CV Template/Active Standard sample-image'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/CV Template display picture'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Standard Skills Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Standard Job Preferences Section'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Compact template container'), 5)

WebUI.closeBrowser()