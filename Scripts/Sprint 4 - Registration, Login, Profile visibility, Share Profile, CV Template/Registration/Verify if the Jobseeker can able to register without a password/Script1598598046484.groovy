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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'Login.GotoWanPNGpage'()

//CustomKeywords.'InputDataRegistration.register'()

WebUI.click(findTestObject('Object Repository/Jobseeker Login Page/Join now link'))

WebUI.setText(findTestObject('Object Repository/Jobseeker Register/First name textbox'), 'qa')

WebUI.setText(findTestObject('Object Repository/Jobseeker Register/Last name textbox'), 'tester')

WebUI.setText(findTestObject('Object Repository/Jobseeker Register/Email address textbox'), 'qa.tester@ubidy.com')

WebUI.click(findTestObject('Object Repository/Jobseeker Register/Join now button'))

WebUI.waitForElementPresent(findTestObject('Jobseeker Register/Password Field validation message'), 5)

WebUI.verifyElementText(findTestObject('Jobseeker Register/Password Field validation message'), GlobalVariable.specifyPasswordRegistration)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Create Profile Header/Create profile header'), 5)

WebUI.closeBrowser()