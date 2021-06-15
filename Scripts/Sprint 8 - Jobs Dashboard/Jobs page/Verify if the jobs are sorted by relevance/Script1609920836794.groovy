import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.STOP_ON_FAILURE
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

WebUI.callTestCase(findTestCase('Call Testcase/Redirect to Jobs Page'), [:], STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Jobs Search bar'), 5)

WebUI.callTestCase(findTestCase('Sprint 8 - Jobs Dashboard/Jobs page/Verify if the jobseeker can search for jobs by job title'), [:], STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Search result counter'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Sort by container'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Select Sort by option'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobs page OR/Relevance option'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Relevance option'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Select Sort by option'), 'Relevance')

WebUI.closeBrowser()
