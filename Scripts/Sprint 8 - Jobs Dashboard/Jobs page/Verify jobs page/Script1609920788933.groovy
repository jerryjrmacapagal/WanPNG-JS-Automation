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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Jobs Page"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Jobs page header title'), 10)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Jobs page header title'), GlobalVariable.jobsPageHeadTitle)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Keyword searchbar'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Job classification dropdown'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Provinces dropdown'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Search button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Applied jobs tab'), 5)

WebUI. delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Applied jobs section'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/No applied jobs icon'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/No applied jobs title'), GlobalVariable.NoAppliedJobs)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/No applied jobs subtitle'), GlobalVariable.NoAppliedJobsSubtitle)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/No saved jobs icon'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/No saved jobs title'), GlobalVariable.NoSavedJobsTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/No saved jobs subtitle'), GlobalVariable.NoSavedJobsSubtitle)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply tab'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/No Invited to apply icon'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/No pending invitations title'), GlobalVariable.NoInvitedToApply)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/No pending invitations subtitle'), GlobalVariable.NoInvitedToApplySubtitle)

WebUI.closeBrowser()