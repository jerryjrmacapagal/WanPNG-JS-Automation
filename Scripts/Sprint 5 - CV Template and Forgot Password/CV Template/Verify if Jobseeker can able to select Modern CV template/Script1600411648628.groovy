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

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'), 5)

//SCENARIO 1: Verify if Jobseeker can able to select 'Modern' CV template
WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Share profile button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Share profile header title'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Templates button'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers CV Template/Active Standard sample-image'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Modern sample-image'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Active Modern sample-image'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Summary Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Work experience Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Education Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Training Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Skills and Competencies Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Job preferences Section'))

//SCENARIO 2: Verify if the jobseeker's profile is displayed as 'Modern' template upon clicking 'Done' button
WebUI.click(findTestObject('Object Repository/Jobseekers CV Template/Done button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Summary Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Work experience Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Education Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Training Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Skills and Competencies Section'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseekers CV Template/Modern Job preferences Section'))

//SCENARIO 3: Verify if the job seeker can download their selected CV template
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