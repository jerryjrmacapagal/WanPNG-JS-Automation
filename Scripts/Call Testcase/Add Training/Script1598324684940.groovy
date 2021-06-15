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

//WebUI.callTestCase(findTestCase('Call Testcase/Jobseeker Login'), [:],FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add training button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add training button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/Title Add training'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/Title Add training'), GlobalVariable.addTraining)

String[] trainingInstitute = findTestData("Universities").getAllData()

int randomInstitute = new Random().nextInt(trainingInstitute.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), findTestData("Universities").getValue("Universities", randomInstitute))

String[] trainingTitle = findTestData("TrainingTitle").getAllData()

int randomTitle = new Random().nextInt(trainingTitle.length + 2)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training title textbox'), findTestData("TrainingTitle").getValue("Training Titles", randomTitle))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/Started Month dropdown'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/Started Month dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/started month/div_June'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/started month/div_June'))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Started Year textbox'), GlobalVariable.trainingStartedYear)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/Ended Month dropdown'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Ended Month dropdown'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Ended Month dropdown'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Ended Year textbox'), GlobalVariable.trainingEndedYear)

String[] description = findTestData("TrainingDescriptions").getAllData()

int randomDescription = new Random().nextInt(description.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/textarea Description'), findTestData("TrainingDescriptions").getValue("Descriptions", randomDescription))