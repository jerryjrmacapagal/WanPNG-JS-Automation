
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


def mobileNumber = "9" + RandomStringUtils.randomNumeric(6)

def village = RandomStringUtils.randomAlphabetic(7)

//Input data
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/Mobile number textbox'), 5)

WebUI.setText(findTestObject('Object Repository/Jobseekers Personal Info OR/Mobile number textbox'), mobileNumber)

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Select province dropdown'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/div_Bougainville Region'))

String[] city = findTestData("Cities").getAllData()

int randomCity = new Random().nextInt(city.length + 1)

WebUI.setText(findTestObject('Object Repository/Jobseekers Personal Info OR/City or village textbox'), findTestData("Cities").getValue("Cities", randomCity))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Date of birth textbox'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/button_2020'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/button_2020-2029'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers Personal Info OR/div_1990-1999'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/div_1990-1999'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/div_1989'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/div_Aug'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/div_13'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Select sex dropdown'))

WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/div_Male'))

//WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Landowner checkbox'))

//WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/Select impact area dropdown'))
//
//WebUI.click(findTestObject('Object Repository/Jobseekers Personal Info OR/div_APDL 11'))