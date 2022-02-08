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

WebUI.callTestCase(findTestCase("Call Testcase/Search for a job"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Job Preview OR/First job card result'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Job Preview OR/First job card result'))

WebUI.waitForElementPresent(findTestObject('Jobs page OR/Job Preview OR/Employer Details/Apply now button'), 5)

WebUI.click(findTestObject('Jobs page OR/Job Preview OR/Employer Details/Apply now button'))

//Apply modal
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply job modal'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply now subtitle'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message to'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), GlobalVariable.applyMessage)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Note tag'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Note tag icon'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Apply job modal/Note tag text'), GlobalVariable.noteTagTip)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Apply job modal/Cancel button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message'), 10)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message'), GlobalVariable.submitApplicationToastMessage)

//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message close'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message close'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied job/Withdraw application button'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Applied job/Withdraw application button'), GlobalVariable.withdrawPopUpMessageApplciation)

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobs page OR/Applied job/Withdraw application button'))

WebUI.closeBrowser()