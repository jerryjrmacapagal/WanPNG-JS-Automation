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

WebUI.callTestCase(findTestCase("Call Testcase/Employer Invite Jobseeker"), [:])

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:])

//Accept invitation
WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page OR/Notification tab'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page OR/Notification tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page OR/First Notification Card'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page OR/First Notification Card'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Job Preview OR/Accept and apply'), 5)

WebUI.click(findTestObject('Object Repository/Job Preview OR/Accept and apply'))

//Apply for the job
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply job modal'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Apply job modal/Message textarea'), GlobalVariable.applyMessage)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Apply job modal/Apply button v2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Applied job/Applied toast message'), 5)

WebUI.callTestCase(findTestCase("Call Testcase/Employer Login"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/Notification tab'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/Notification tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/First notification'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Notification OR/First notification'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Change status button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Change status button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Shortlist option'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Shortlist option'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Change Status modal'), 5)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Change status message'), "Your application is moved to Shotlist")

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Move to status button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer JS profile viewer/Change status toast message'), 5)

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page OR/Notification tab'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page OR/Notification tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page OR/First Notification Card'), 5)

WebUI.verifyTextPresent("has been moved to Shortlist", true)

WebUI.closeBrowser()