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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Add affiliation button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Add affiliation button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Add Affiliation/Add affiliation title'), 5)

String[] affiliations = findTestData("Affiliations").getAllData()

int randomAffiliation = new Random().nextInt(affiliations.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseeker Add Affiliation/Organization textbox'), findTestData("Affiliations").getValue("Affiliations", randomAffiliation))

WebUI.setText(findTestObject('Object Repository/Jobseeker Add Affiliation/Role textbox'), "Member")

String[] cities = findTestData("Cities").getAllData()

int randomCity = new Random().nextInt(cities.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseeker Add Affiliation/Location textbox'), findTestData("Cities").getValue("Cities", randomCity))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseeker Add Affiliation/Started month dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Add Affiliation/Started month dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Add Affiliation/Month March'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Add Affiliation/Month March'))

WebUI.setText(findTestObject('Object Repository/Jobseeker Add Affiliation/Started year textbox'), '2018')

//WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseeker Add Affiliation/Ended year dropdown'), 5)
//
//WebUI.click(findTestObject('Object Repository/Jobseeker Add Affiliation/Ended year dropdown'))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseeker Add Affiliation/Ended year dropdown'), Keys.chord(Keys.ARROW_DOWN))
//
//WebUI.sendKeys(findTestObject('Object Repository/Jobseeker Add Affiliation/Ended year dropdown'), Keys.chord(Keys.ENTER))
//

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseeker Add Affiliation/Current affiliation checkbox'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Add Affiliation/Current affiliation checkbox'))

//WebUI.setText(findTestObject('Object Repository/Jobseeker Add Affiliation/Ended year textbox'), '2021')