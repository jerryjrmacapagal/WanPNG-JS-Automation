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

//WebUI.callTestCase(findTestCase("Call Testcase/Redirect to my profile"), [:])

CustomKeywords.'Login.GotoWanPNGpage'()

CustomKeywords.'Login.MessengerEmptyState'()

//SCENARIO 1: Verify the implemented UI design for inbox section (Empty state)
//SCENARIO 2: Verify the implemented UI design for chat box section (Empty state) 
WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Messenger tab'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Messenger tab'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Messenger Page OR/Messenger page container'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Messenger Page OR/Messages title'), "Messages")

WebUI.verifyElementClickable(findTestObject('Object Repository/Messenger Page OR/Messages more options dropdown'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Messenger Page OR/Search messages textbox'), 5)

WebUI.verifyElementClickable(findTestObject('Object Repository/Messenger Page OR/Messages filter dropdown'))

WebUI.verifyTextPresent("No messages yet", true)

WebUI.verifyTextPresent("Messages from applications and invitations will show up here.", true)

WebUI.verifyTextPresent("Start a conversation", true)

WebUI.verifyTextPresent("Apply to jobs or get invited to apply to start a conversation with employers.", true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Messenger Page OR/Empty state icon'))

WebUI.closeBrowser()