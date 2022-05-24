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

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:])

//Verify if notification badge is displayed when the jobseeker received a new notification
WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page OR/Notification tab'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page OR/Badge counter'), 5)

//SCENARIO 2: Verify if the notification counter disappears upon clicking the notification icon
WebUI.click(findTestObject('Object Repository/Notification Page OR/Notification tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page OR/Notification pop over content'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Notification Page OR/Badge counter'), 5)

//SCENARIO 3: Verify if the notification indicator (red dot) would disappear upon clicking on the notification
WebUI.sendKeys(findTestObject('Object Repository/Notification Page OR/First Notification Card'), Keys.chord(Keys.CONTROL))

WebUI.verifyElementPresent(findTestObject('Object Repository/Notification Page OR/Unread icon'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Notification Page OR/First Notification Card'), Keys.chord(Keys.CONTROL + Keys.ENTER))

WebUI.delay(5)

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Object Repository/Notification Page OR/Notification tab'), 5)

WebUI.click(findTestObject('Object Repository/Notification Page OR/Notification tab'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Notification Page OR/Unread icon'), 5)

WebUI.closeBrowser()