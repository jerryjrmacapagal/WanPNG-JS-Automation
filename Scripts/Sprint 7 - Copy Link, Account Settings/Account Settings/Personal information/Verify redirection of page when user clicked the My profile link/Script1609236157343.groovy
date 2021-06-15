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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Account Settings"), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info My profile link'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info My profile link'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/My profile header'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers My Profile OR/My profile header'), GlobalVariable.myProfile)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Share profile button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Personal information section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Summary section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Work experience section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Education section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Training section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Skills competencies section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Profile visibility section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers My Profile OR/Job preferences section'))

WebUI.closeBrowser()