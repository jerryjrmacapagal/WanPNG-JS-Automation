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

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:], FailureHandling.STOP_ON_FAILURE)

//SCENARIO 1: Verify if Jobseeker can able to select 'Corporate' CV template
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Templates button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Templates button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Corporate sample-image'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Corporate sample-image'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Corporate template title'), GlobalVariable.corporateTemplate)

//SCENARIO 2: Verify if the jobseeker's profile is displayed as 'Corporate' template upon clicking 'Done' button
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Done button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Done button'))

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Jobseekers CV Template/Done button'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers CV Template/Choose a template title'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile Back button'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Note display container'), 5)

//SCENARIO 3: Verify if the jobseeker can download their chosen CV template
WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Download link'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseekers CV Template/Download text'), GlobalVariable.downloadText)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Download link'))

WebUI.delay(20)

File downloadFolder = new File("C:\\Users\\USER\\Downloads")

List namesOfFiles = Arrays.asList(downloadFolder.list())

if (namesOfFiles.contains("Jerry,_Jr._Macapagal.pdf")) {
	println "File downloaded"
}
else {
	println "Failure"
}

WebUI.closeBrowser()