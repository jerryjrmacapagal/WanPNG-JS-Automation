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
WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1: Verify if Job Seeker can able to cancel adding a training background using 'Cancel' button
WebUI.callTestCase(findTestCase("Call Testcase/Add Training"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Cancel'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Education/Discard changes modal'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Jobseekers Add Training/Title Add training'), 5)


//SCENARIO 2: Verify if Job Seeker can able to add Training background without Training institution
WebUI.callTestCase(findTestCase("Call Testcase/Add Training"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/validations/div_Training institution is required'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/validations/div_Training institution is required'), GlobalVariable.institutionValidation)

WebUI.takeScreenshot()

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add training button'), 5)

//SCENARIO 3: Verify if Job Seeker can able to add Training background without training title

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), GlobalVariable.trainingInstitutionValue)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training title textbox'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Add Training/Training title textbox'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/validations/div_Training title is required'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/validations/div_Training title is required'), GlobalVariable.trainingValidation)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Cancel'))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Education/Discard button'))

//SCENARIO 4: Verify if Job Seeker can able to add Training background without selected month - year
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add training button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add training button'))

String[] institute = findTestData("Universities").getAllData()

int randomInsitute = new Random().nextInt(institute.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training institution textbox'), findTestData("Universities").getValue("Universities", randomInsitute))

String[] trainingTitle = findTestData("TrainingTitle").getAllData()

int randomTitle = new Random().nextInt(trainingTitle.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/Training title textbox'), findTestData("TrainingTitle").getValue("Training Titles", randomTitle))

String[] description = findTestData("TrainingDescriptions").getAllData()

int randomDescription = new Random().nextInt(description.length + 2)

WebUI.setText(findTestObject('Object Repository/Jobseekers Add Training/textarea Description'), findTestData("TrainingDescriptions").getValue("Descriptions", randomDescription))

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.delay(5)

//SCENARIO 5: Verify if Job Seeker can able to add a training background using 'Save' button 
WebUI.callTestCase(findTestCase("Call Testcase/Add Training"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Training/button Save'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Training/Display Training Background'), 5)

//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Training/h2_Pendleton State University'), findTestData("Universities").getValue("Universities", randomInsitute))

WebUI.closeBrowser()