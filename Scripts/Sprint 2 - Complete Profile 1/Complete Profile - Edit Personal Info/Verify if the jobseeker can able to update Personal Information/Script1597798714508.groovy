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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

//Call login

//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:], FailureHandling.STOP_ON_FAILURE)

//execute testcase
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'), 10)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Email address textbox'), 5)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Email address textbox')) 

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/City or village textbox'), Keys.chord(Keys.CONTROL, 'a'))

String[] updatedCity = findTestData("Cities").getAllData()

int randomCity = new Random().nextInt(updatedCity.length + 1)

WebUI.sendKeys(findTestObject('Object Repository/Jobseekers Personal Info OR/City or village textbox'), findTestData("Cities").getValue("Cities", randomCity))

WebUI.click(findTestObject('Object Repository/Jobseekers Edit Personal Info/Save button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit personal info button'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/Updated City'), GlobalVariable.updatedCityPersonalInfo + findTestData("Cities").getValue("Cities", randomCity))

//WebUI.closeBrowser()