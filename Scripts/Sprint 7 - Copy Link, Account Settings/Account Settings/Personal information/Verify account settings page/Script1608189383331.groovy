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

WebUI.callTestCase(findTestCase("Call Testcase/Redirect to Account Settings"), [:], FailureHandling.STOP_ON_FAILURE)

//Personal Info Section

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info section'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Account Name'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Date of birth'), GlobalVariable.dateOfBirth)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Date of birth'), "value", "13 Aug 1989", 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Sex'), GlobalVariable.sex)

//WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input Sex'), "title", "Male", 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Email address'), "Email address")

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Input_Email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Note Card'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info Note Card'), GlobalVariable.accountSettingsNotecCard + GlobalVariable.space + GlobalVariable.myProfile + ".")

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Account Settings/Personal Info My profile link'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Save changes button'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Save changes text'), GlobalVariable.saveChanges)

//Change password

WebUI.verifyElementPresent(findTestObject('Object Repository/Jobseeker Account Settings/Change password Title'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Change password Title'), GlobalVariable.changePassword)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Current password label'), GlobalVariable.currentPassword)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Input Current password'))

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/Current password Show button'), GlobalVariable.show)

WebUI.verifyElementText(findTestObject('Object Repository/Jobseeker Account Settings/New password label'), GlobalVariable.newPassword)

WebUI.verifyElementVisible(findTestObject('Object Repository/Jobseeker Account Settings/Input New password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Account Settings/Current password Show button'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Jobseeker Account Settings/New password Show button'))

//WebUI.closeBrowser()