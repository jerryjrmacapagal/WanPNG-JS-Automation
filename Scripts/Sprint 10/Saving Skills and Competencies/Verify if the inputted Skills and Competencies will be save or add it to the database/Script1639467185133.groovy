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

WebUI.callTestCase(findTestCase("Call Testcase/Jobseeker Login"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/My profile header'), 5)

WebUI.scrollToElement(findTestObject('Object Repository/Jobseekers My Profile OR/Skills competencies section'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'), 5)

WebUI.click(findTestObject('Object Repository/Jobseekers My Profile OR/Edit skills and competencies button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), 5)

String[] skills = findTestData("Skills").getAllData()

int randomSkill = new Random().nextInt(skills.length +2)

WebUI.setText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill or competency textbox'), findTestData("Skills").getValue("Skills", randomSkill))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill level dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Skill level dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'), 5)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/div_Advanced'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/My Profile Add button'), 5)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/My Profile Add button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Newly added skill tag'), 5)

//WebUI.verifyElementText(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Newly added skill tag'), findTestData("Skills").getValue("Skills", randomSkill))

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Newly added skill tag'), 5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'), 5)

WebUI.click(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Job Seeker Skills and Competencies OR/Save button'), 5)

WebUI.closeBrowser()