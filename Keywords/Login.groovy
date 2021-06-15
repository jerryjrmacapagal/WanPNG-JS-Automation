import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

class Login {

	@Keyword
	def GotoWanPNGpage() {
		WebUI.openBrowser(GlobalVariable.UAT)
		WebUI.maximizeWindow()
	}

	@Keyword
	def loginAccount() {
		WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Email address textbox'), GlobalVariable.registeredEmail1)
		WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Password textbox'), GlobalVariable.kcPassword)
		WebUI.click(findTestObject('Object Repository/Jobseeker Login Page/Login button'))
	}

	@Keyword
	def InputdataLogin() {
		WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Email address textbox'), GlobalVariable.registeredEmail1)
		WebUI.setText(findTestObject('Object Repository/Jobseeker Login Page/Password textbox'), GlobalVariable.kcPassword)
	}
}