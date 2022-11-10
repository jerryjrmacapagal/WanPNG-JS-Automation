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

//WebUI.callTestCase(findTestCase("Call Testcase/Search for a job"), [:])

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Jobs Page"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/First job card'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/First job card'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Job search OR/First card job search result'), 5)
//
//WebUI.click(findTestObject('Object Repository/Job search OR/First card job search result'))

WebUI.waitForElementPresent(findTestObject('Job Preview OR/Job posting container'), 5)

WebUI.verifyElementPresent(findTestObject('Job Preview OR/View company profile button'), 5)

WebUI.click(findTestObject('Job Preview OR/View company profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Company Profile OR/Company profile section'), 5)

//CustomKeywords.'checkwebsitebutton.checkVisitWebsiteButton'(findTestObject('Object Repository/Company Profile OR/Visit Website button'))

WebUI.closeBrowser()