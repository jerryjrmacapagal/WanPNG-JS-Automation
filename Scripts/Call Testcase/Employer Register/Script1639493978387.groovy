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
import org.apache.commons.lang.RandomStringUtils

WebUI.openBrowser(GlobalVariable.employerDev)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Join now Button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Join now Button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Firstname input'), 5)

String[] firstname = findTestData("Firstnames").getAllData()

int randomFirstname = new Random().nextInt(firstname.length)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Firstname input'), findTestData("Firstnames").getValue("First Names", randomFirstname))

String[] lastname = findTestData("Lastnames").getAllData()

int randomLastname = new Random().nextInt(lastname.length)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Lastname input'), findTestData("Lastnames").getValue("Surnames", randomLastname))

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Company name input'), findTestData("Lastnames").getValue("Surnames", randomLastname) + " Recruitment Company")

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Work email input'), "qa.tester+" + findTestData("Firstnames").getValue("First Names", randomFirstname) + "@ubidy.com")

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Create password input'), GlobalVariable.kcPassword)

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Register button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Register Page OR/Register button'))

//Complete Profile
WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Industry input'), 5)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Industry input'), "Oil & Gas")

def number = "+675" + RandomStringUtils.randomNumeric(4)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Company number input'), number)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Company address input'), "P.O. Box 1338 611 Kokopo")

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Next button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Next button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Company description textarea'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Company description textarea'))

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Company description textarea'), GlobalVariable.companyDescription)

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Done button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Complete Profile/Done button'))