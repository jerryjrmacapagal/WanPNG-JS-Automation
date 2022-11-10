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

//SCENARIO 1: Verify the job preview if there's "View company profile" to see the company details
WebUI.waitForElementPresent(findTestObject('Object Repository/Job search OR/First card job search result'), 5)
//Job result
WebUI.click(findTestObject('Object Repository/Job search OR/First card job search result'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Job posting container'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/Job preview next button'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/View company profile button'), 5)

WebUI.verifyElementClickable(findTestObject('Job Preview OR/View company profile button'))
//Applied Jobs
WebUI.verifyElementPresent(findTestObject('Job Preview OR/Job preview Close button'), 5)

WebUI.click(findTestObject('Job Preview OR/Job preview Close button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Jobs page tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Jobs page tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Applied jobs tab'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/First job card'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/First job card'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Job posting container'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/View company profile button'), 5)

WebUI.verifyElementClickable(findTestObject('Job Preview OR/View company profile button'))

WebUI.verifyElementPresent(findTestObject('Job Preview OR/Job preview Close button'), 5)

WebUI.click(findTestObject('Job Preview OR/Job preview Close button'))
//Saved Jobs
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Saved jobs tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Save jobs OR/First saved job card'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Save jobs OR/First saved job card'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Job posting container'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/View company profile button'), 5)

WebUI.verifyElementClickable(findTestObject('Job Preview OR/View company profile button'))

WebUI.verifyElementPresent(findTestObject('Job Preview OR/Job preview Close button'), 5)

WebUI.click(findTestObject('Job Preview OR/Job preview Close button'))
//Invited to Apply
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/First card Job invitation'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Invited to apply Section/First card Job invitation'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Job posting container'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/View company profile button'), 5)

WebUI.verifyElementClickable(findTestObject('Job Preview OR/View company profile button'))

//SCENARIO 2: Verify the details upon clicking the "View company profile" button
WebUI.verifyElementPresent(findTestObject('Job Preview OR/View company profile button'), 5)

WebUI.click(findTestObject('Job Preview OR/View company profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Company Profile OR/Company profile section'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company profile header'), 5)

//WebUI.verifyTextPresent(GlobalVariable.companyProfile, true)

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company Name'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company Logo'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company Industry'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company Address'), 5)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company Website'), 5)

//WebUI.verifyElementClickable(findTestObject('Object Repository/Company Profile OR/Company Website'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company Number'), 5)

//WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Visit Website button'), 5)
//
//WebUI.verifyElementClickable(findTestObject('Object Repository/Company Profile OR/Visit Website button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Share profile button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Company Profile OR/Share profile button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/View all jobs button'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Company Profile OR/View all jobs button'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Company Summary Section'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Careers tab'), 5)

//Careers tab
WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Latest jobs title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Company Profile OR/Latest jobs title'), 'Latest Jobs')

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/Latest Jobs list'), 5)

//About tab
WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/About tab'), 5)

WebUI.click(findTestObject('Object Repository/Company Profile OR/About tab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/About us title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Company Profile OR/About us title'), 'About us')

WebUI.verifyElementPresent(findTestObject('Object Repository/Company Profile OR/About us subtitle'), 5)

WebUI.verifyTextPresent(GlobalVariable.about, true)

WebUI.closeBrowser()