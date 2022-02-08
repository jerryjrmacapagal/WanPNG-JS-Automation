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

//Redirect to my profile
//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//execute testcase
WebUI.callTestCase(findTestCase("Call Testcase/Add work experience"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete work exp button'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete work exp button'), GlobalVariable.deleteButton)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete work exp button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete work experience title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete work experience title'), GlobalVariable.deleteWorkExpModalTitle)

//WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete work experience subtitle'), GlobalVariable.deleteWorkExpSubtitle + ' ' + GlobalVariable.trainingTitleValue + ' at ' + GlobalVariable.companyName + '.')

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete button_Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete span_Cancel'), GlobalVariable.cancelButton)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete button_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete span_Delete'), GlobalVariable.deleteButton)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete button_Cancel'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete button_Delete'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete work exp button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete button_Delete'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete button_Delete'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Delete button_Delete'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/h2_Mechanical Engineering'), 5)

//WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Add Work Experience/Edit button'), 5)

WebUI.closeBrowser()