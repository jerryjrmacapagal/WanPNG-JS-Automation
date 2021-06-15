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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add work experience button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add work experience button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Job title textbox'), 5)

String[] jobtitle = findTestData("Geochemist Jobtitle").getAllData()

int randomJobtitle = new Random().nextInt(jobtitle.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Job title textbox'), findTestData("Geochemist Jobtitle").getValue("Jobtitles", randomJobtitle))

String[] companyname = findTestData('CompanyName').getAllData()

int randomCompany = new Random().nextInt(companyname.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Company name textbox'), findTestData("CompanyName").getValue("Company Names", randomCompany))

String[] location = findTestData("Cities").getAllData()

int randomCity = new Random().nextInt(location.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Location textbox'), findTestData("Cities").getValue("Cities", randomCity))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromMonth'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Started fromYear'), GlobalVariable.endedYearValue2)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Ended toMonth'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Ended toMonth'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Work Experience/Ended toMonth'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Started toYear'), GlobalVariable.workEndedYear)

String[] description = findTestData("Senior Software Descriptions").getAllData()

int randomDescription = new Random().nextInt(description.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Work Experience/Description textarea'), findTestData("Geochemist Description").getValue("Geochemist Description", randomDescription))