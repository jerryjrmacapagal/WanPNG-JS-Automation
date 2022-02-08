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

//Create Profile Page
WebUI.callTestCase(findTestCase('Call Testcase/Jobseeker Register'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Create Profile Header/Create profile header'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Create Profile Header/Personal information tab header'), 
    'Personal information')

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Create Profile Header/Step 1 tab'), '1')

//Personal Information Tab
WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Personal information title'), 'Personal information')

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Personal information subtitle'), 'Tell us about yourself so employers can get to know you and contact you for a job interview!')

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers Personal Info OR/Image holder'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Add photo button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Add Photo text'), 'Upload photo')

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/First name label'), 'First name')

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/First name textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name label'), 'Last name')

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Last name textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Email address label'), 'Email address')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Email address textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Mobile number label'), 'Mobile number')

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Mobile number textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Province label'), 'Province or state')

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Select province dropdown'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/City or village label'), 'City or town')

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/City or village textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Date of birth label'), 'Date of birth')

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Date of birth textbox'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers Personal Info OR/Sex label'), 'Sex')

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseekers Personal Info OR/Select sex dropdown'))

WebUI.closeBrowser()

