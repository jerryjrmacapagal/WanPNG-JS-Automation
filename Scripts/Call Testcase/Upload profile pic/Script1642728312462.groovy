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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.100.205:30300/profile')
//
//WebUI.click(findTestObject('Object Repository/Upload image/Page_Certificate verification problem detected/a_Show details'))
//
//WebUI.click(findTestObject('Object Repository/Upload image/Page_Certificate verification problem detected/a_wish to continue'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_Log in to Jobseeker/input_Email address_username'))

WebUI.setText(findTestObject('Object Repository/Upload image/Page_Log in to Jobseeker/input_Email address_username'), 'jerry.macapagal+sam@ubidy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Upload image/Page_Log in to Jobseeker/input_Password_password'), 
    'CviCRz67XmEgL7sU+DO9HQ==')

WebUI.click(findTestObject('Object Repository/Upload image/Page_Log in to Jobseeker/input_Email address_display-password'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_Log in to Jobseeker/input_Forgot your password_login-button'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/span_Edit'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/button_Update photo'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/span_Upload photo'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/canvas'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/span_Save'))

WebUI.click(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/div_Your profile photo has been uploaded'))

WebUI.verifyElementText(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/div_Your profile photo has been uploaded'), 
    'Your profile photo has been uploaded.')

WebUI.click(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Upload image/Page_WAN PNG - Jobseekers/img_Share profile_preload-image user-avatar_857642'), 
    0)

