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

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1: Verify note displayed if the jobseeker selected 'Standard' in profile visibility
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Standard (Default) title'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Standard (Default) title'))

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Note display container'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Note display title'), GlobalVariable.noteStandardDisplay)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Note display subtitle'), GlobalVariable.noteStandardDescription)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile Back button'))

//SCENARIO 2: Verify note displayed if the jobseeker selected 'Limited' in profile visibility
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Limited title'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Limited title'))

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Note display container'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Note display title'), GlobalVariable.noteLimitedDisplay)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Note display subtitle'), GlobalVariable.noteLimitedDescription)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile Back button'))

//SCENARIO 3: Verify note displayed if the jobseeker selected 'Hidden' in profile visibility
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Change profile visibility button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Hidden'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Profile visibility Hidden'))

WebUI.click(findTestObject('Object Repository/Jobseekers Profile Visibility/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Note display container'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Note display title'), GlobalVariable.noteHiddenDisplay)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Note display subtitle'), GlobalVariable.noteHiddenDescription)

WebUI.closeBrowser()