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

WebUI.callTestCase(findTestCase("Call Testcase/Search for a job"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter button'), 5)

//SCENARIO 1: Verify if the jobseeker can apply filter without Pay period
WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Full Time'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Full Time'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Part Time'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Contract'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Freelance'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Internship'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Internship'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Entry Level'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Mid-Senior Level'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Executive'))

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate text field'), GlobalVariable.minimumRateValue)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter tags container'), 5)

//SCENARIO 2: Verify if the jobseeker can apply filter without Pay period and Minimum rate (PGK)
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate text field'), Keys.chord(Keys.CONTROL, "a"))

WebUI.sendKeys(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate text field'), Keys.chord(Keys.BACK_SPACE))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter tags container'), 5)

//SCENARIO 3: Verify if the jobseeker can apply filter without minimum rate (PGK)
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Monthly'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Monthly'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate validation message'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate validation message'), GlobalVariable.minimumRateValidation)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal title'))

//SCENARIO 4: Verify if the jobseeker can apply without selecting a Company type - SKIP


//SCENARIO 5: Verify if the jobseeker can apply filter
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate text field'), 5)

WebUI.setText(findTestObject('Object Repository/Jobs page OR/Filter Options/Minimum rate text field'), GlobalVariable.minimumRateValue)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Apply filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter tags container'), 5)

//SCENARIO 6: Verify if the jobseeker can update the applied filter
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter button'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter modal'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Contract'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Part Time'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Entry Level'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Option Internship'))

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Selected pay period dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Weekly'), 5)

WebUI.click(findTestObject('Object Repository/Jobs page OR/Filter Options/Pay period Weekly'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Filter Display/Filter tags container'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobs page OR/Search result container'), 5)

WebUI.closeBrowser()