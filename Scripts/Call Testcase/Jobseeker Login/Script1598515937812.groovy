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
import org.openqa.selenium.Keys

WebUI.openBrowser(GlobalVariable.UAT)

WebUI.maximizeWindow()

WebUI.delay(3)

//WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Email address textbox'), "qa.tester+gesupo4010@ubidy.com")

//Dev envi
//WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Email address textbox'), "qa.tester+kompamp-meta660@ubidy.com")

//WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Email address textbox'), "qa.tester+ife505@ubidy.com")

//UAT envi
WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Email address textbox'), "jerry.macapagal+bradley@ubidy.com")

WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Password textbox'), GlobalVariable.kcPassword)

WebUI.click(findTestObject('Object Repository/Jobseeker Login Page/Login button'))