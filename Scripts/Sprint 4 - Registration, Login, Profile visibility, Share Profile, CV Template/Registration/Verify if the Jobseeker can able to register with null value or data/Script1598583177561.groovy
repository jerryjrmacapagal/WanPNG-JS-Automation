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

//Go to WanPNG
CustomKeywords.'Login.GotoWanPNGpage'()

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Login Page/Join now link'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Login Page/Join now link'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Register/Join now button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseeker Register/Join now button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Register/Firstname Field validation message'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Register/Lastname Field validation message'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Register/Email Field validation message'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Register/Password Field validation message'), 5)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Jobseekers Create Profile Header/Create profile header'), 5)

WebUI.closeBrowser()