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

//WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Add education title'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), 5)

String[] universities = findTestData("Universities").getAllData()

int randomUniversity = new Random().nextInt(universities.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), findTestData("Universities").getValue("Universities", randomUniversity))

GlobalVariable.variable = findTestData("Universities").getValue("Universities", randomUniversity)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Level of education textbox'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Bachelors'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Bachelors'))

String[] fieldOfStudy = findTestData("Petroleum Engineer Fields").getAllData()

int randomFields = new Random().nextInt(fieldOfStudy.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Field of study textbox'), findTestData("Geochemist Fields").getValue("Fields", randomFields))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Started Month dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/started month/div_January'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/started month/div_January'))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'), GlobalVariable.startedYearValue2)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/ended month/div_January'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Ended Year'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Ended Year'), GlobalVariable.endedYearValue2)

String[] description = findTestData("EducationDescriptions").getAllData()

int randomDescription = new Random().nextInt(description.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Description textarea'), findTestData("EducationDescriptions").getValue("Descriptions", randomDescription))
