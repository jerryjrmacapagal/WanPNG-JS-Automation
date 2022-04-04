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

//Redirect to my profile
//WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1: Verify if Jobseeker can able to cancel adding a work experience using "Cancel" button
WebUI.callTestCase(findTestCase("Call Testcase/Add work experience"), [:], FailureHandling.STOP_ON_FAILURE)
//
WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Cancel button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Discard changes modal'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard changes title'), GlobalVariable.discardChangesTitle)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard changes subtitle'), GlobalVariable.discardChangesSubtitle)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Education/Discard close icon'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard cancel text'), GlobalVariable.cancelButton)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Discard text'), GlobalVariable.discardButtonText)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Discard cancel button'))

//SCENARIO 2: Verify if Jobseeker can able to add a work experience using "Save" button

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Display work experience'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'), 5)

//SCENARIO 3: Verify if Jobseeker can able to add multiple work experience
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add work experience button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add work experience button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Job title textbox'), 5)

String[] jobtitle = findTestData("Geochemist Jobtitle").getAllData()

int randomJobtitle = new Random().nextInt(jobtitle.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Job title textbox'), findTestData("Geochemist Jobtitle").getValue("Jobtitles", randomJobtitle))

String[] company = findTestData("CompanyName").getAllData()

int randomCompany = new Random().nextInt(company.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Company name textbox'), findTestData("CompanyName").getValue("Company Names", randomCompany))

String[] location = findTestData("Cities").getAllData()

int randomLocation = new Random().nextInt(location.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Location textbox'), findTestData("Cities").getValue("Cities", randomLocation))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromYear'), GlobalVariable.workEndedYear)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Started checkbox'))

String[] description = findTestData("Geochemist Description").getAllData()

int randomDescription = new Random().nextInt(description.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Description textarea'), findTestData("Geochemist Description").getValue("Geochemist Description", randomDescription))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'), 5)

//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/h2_Electrical Engineer'), findTestData("Jobtitle").getValue("Jobtitles", randomJobtitle))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/p_IMPACT'), findTestData("CompanyName").getValue("Company Names", randomCompany))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/p_Buka'), findTestData("Cities").getValue("Cities", randomLocation))

//WebUI.closeBrowser()