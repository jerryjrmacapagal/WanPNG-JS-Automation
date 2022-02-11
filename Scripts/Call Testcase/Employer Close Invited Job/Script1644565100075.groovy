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

WebUI.callTestCase(findTestCase("Call Testcase/Employer Invite Jobseeker"), [:])

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Close Candidate Viewer'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/Close Candidate Viewer'))

WebUI.scrollToElement(findTestObject('Object Repository/Employer Object Repository/Employer Jobs Page/Jobs page tab'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Jobs Page/Jobs page tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/First Card Job Post'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Invite Jobseeker OR/First Card Job Post'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Active dropdown button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Active dropdown button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Application Status/Close option'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Application Status/Close option'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Close job posting confirmation/Close job confirmation modal'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Close job posting confirmation/Close job button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Close job posting confirmation/Close job button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Job Post/Closed job dropdown button'), 5)