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
//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1: Verify if Job Seeker can able to add Education background without School or University
//WebUI.callTestCase(findTestCase("Call Testcase/Add education"), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), Keys.chord(Keys.CONTROL, 'a'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), Keys.chord(Keys.BACK_SPACE))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/School or university validation'), 5)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/School or university validation'), GlobalVariable.schoolUniversityValidation)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Cancel button'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

//SCENARIO 2: Verify if Job Seeker can able to add Education background without selected Level of education
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Add education title'), 5)
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), 5)
//
//String[] university = findTestData("Universities").getAllData()
//
//int randomUniversity = new Random().nextInt(university.length + 1)
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), findTestData("Universities").getValue("Universities", randomUniversity))
//
//String[] fieldOfStudy = findTestData("IT Fields").getAllData()
//
//int randomField = new Random().nextInt(fieldOfStudy.length + 1)
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Field of study textbox'), findTestData("IT Fields").getValue("Fields", randomField))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/Start Month Click'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/started month/div_January'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/started month/div_January'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'))
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'), GlobalVariable.startedYearValue)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'), Keys.chord(Keys.ARROW_DOWN))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'), Keys.chord(Keys.ARROW_DOWN))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Month'), Keys.chord(Keys.ENTER))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Ended Year'))
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Ended Year'), GlobalVariable.endedYearValue)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Description textarea'))

//String[] description = findTestData("EducationDescriptions").getAllData()
//
//int randomDescription = new Random().nextInt(description.length + 2)
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Description textarea'), findTestData("EducationDescriptions").getValue("Descriptions", randomDescription))

//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Level of education validation'), 5)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Level of education validation'), GlobalVariable.levelOfEducationValidation)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Cancel button'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

//SCENARIO 3: Verify Level of education options
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Level of education textbox'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Level of education textbox'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_No Formal Education'), GlobalVariable.noFormalEducation)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Elementary'), GlobalVariable.elementaryEducation)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Secondary'), GlobalVariable.secondaryEducation)
//
//WebUI.verifyElementText(findTestObject('Jobseekers Add Education/Level of education/div_upperPrimary'), GlobalVariable.upperPrimary)
//
//WebUI.verifyElementText(findTestObject('Jobseekers Add Education/Level of education/div_lowerPrimary'), GlobalVariable.lowerPrimary)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Bachelors'), GlobalVariable.bachelorsEducation)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Masters'), GlobalVariable.mastersEducation)
//
//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_PhD'), GlobalVariable.phdEducation)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Level of education textbox'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Cancel button'))

//SCENARIO 4: Verify if Job Seeker can able to add Education background without selected month - year
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'))
//
//String[] school = findTestData("Universities").getAllData()
//
//int randomSchool = new Random().nextInt(school.length + 1)
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), findTestData("Universities").getValue("Universities", randomSchool))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Level of education textbox'))
//
//WebUI.waitForElementPresent(findTestObject('Jobseekers Add Education/Level of education/div_upperPrimary'), 5)
//
//WebUI.click(findTestObject('Jobseekers Add Education/Level of education/div_upperPrimary'))

//String[] fieldOfStudy2 = findTestData("Fields").getAllData()
//
//int randomFieldOfStudy2 = new Random().nextInt(fieldOfStudy2.length + 1)
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Field of study textbox'), findTestData("Fields").getValue("Field of studies", randomFieldOfStudy2))

//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))
//
//WebUI.delay(5)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add education button'), 5)

//SCENARIO 5: Verify if job Seeker can add an educational background
//WebUI.callTestCase(findTestCase("Call Testcase/Add education"), [:],, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'))

//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/School or university textbox'), GlobalVariable.schoolValue)

//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/span_Bachelors'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/span_Bachelors'))
//
//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Secondary'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Level of education/div_Secondary'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Field of study textbox'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Field of study textbox'), Keys.chord(Keys.CONTROL, 'a'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Field of study textbox'), Keys.chord(Keys.BACK_SPACE))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'), Keys.chord(Keys.CONTROL, 'a'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'), Keys.chord(Keys.BACK_SPACE))
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Started Year textbox'), GlobalVariable.startedYearValue)
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Year'), Keys.chord(Keys.CONTROL, 'a'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Education/Ended Year'), Keys.chord(Keys.BACK_SPACE))
//
//WebUI.setText(findTestObject('Object Repository/Jobseekers Add Education/Ended Year'), GlobalVariable.endedYearValue)

//WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))
//
//WebUI.delay(5)
//
//WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Education/Save button'), 5)
//
//WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 5)

//Verify if Job Seeker can able to add multiple education background
WebUI.callTestCase(findTestCase("Call Testcase/Add education"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Save button'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Education/Save button'), 5)

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Edit education button'), 5)

//WebUI.closeBrowser()

