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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

CustomKeywords.'Login.GotoWanPNGpage'()

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Log in to Jobseeker/register link'), 5)

WebUI.click(findTestObject('Object Repository/Page_Log in to Jobseeker/register link'))

String[] firstnames = findTestData("Firstnames").getAllData()

int randomFirstNames = new Random().nextInt(firstnames.length + 1)

WebUI.setText(findTestObject('Object Repository/Page_Log in to Jobseeker/register input firstName'), findTestData('Firstnames').getValue('First Names', randomFirstNames))

GlobalVariable.FirstnameValue = findTestData('Firstnames').getValue('First Names', randomFirstNames)

String[] lastnames = findTestData("Lastnames").getAllData()

int randomLastNames = new Random().nextInt(lastnames.length + 1)

WebUI.setText(findTestObject('Object Repository/Page_Log in to Jobseeker/register input lastName'), findTestData('Lastnames').getValue('Surnames', randomLastNames))

def emailAddress = (GlobalVariable.kcEmailAddress + GlobalVariable.FirstnameValue + RandomStringUtils.randomNumeric(3)) + GlobalVariable.kcDomain

//def emailAddress = (GlobalVariable.kcEmailAddress + GlobalVariable.FirstnameValue + GlobalVariable.LastnameValue + GlobalVariable.kcDomain)

WebUI.setText(findTestObject('Object Repository/Page_Log in to Jobseeker/register input email'), emailAddress)

WebUI.setText(findTestObject('Object Repository/Page_Log in to Jobseeker/register input password'), GlobalVariable.kcPassword)

GlobalVariable.registeredEmail1 = emailAddress

WebUI.click(findTestObject('Object Repository/Jobseeker Register/Join now button'))