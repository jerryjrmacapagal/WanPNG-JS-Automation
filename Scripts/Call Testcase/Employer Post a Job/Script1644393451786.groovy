import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

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

WebUI.callTestCase(findTestCase("Call Testcase/Employer Login"), [:])

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Post a Job button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Post a Job button'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job builder page'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job title input'), 5)

String[] jobtitle = findTestData("Jobtitle").getAllData()

int randomJobtitle = new Random().nextInt(jobtitle.length + 1)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job title input'), findTestData("Jobtitle").getValue("Jobtitles", randomJobtitle))

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Similar job title input'), findTestData("Jobtitle").getValue("Jobtitles", randomJobtitle))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Province dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Province dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/City Options/Central'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/City Options/Central'))

String[] city = findTestData("Cities").getAllData()

int randomCity = new Random().nextInt(city.length + 1)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/City input'), findTestData("Cities").getValue("Cities", randomCity))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Career level dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Career level dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Career Level Options/Executive'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Career Level Options/Executive'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Employment type dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Employment type dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Field of study input'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Employment Type Options/Full Time'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job Classification Options/Construction'), 5)

//WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job Classification Options/Construction'))
//
//WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'))

WebUI.focus(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job Classification Options/Construction'))

WebUI.sendKeys(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'), Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job classification dropdown'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job subclassification dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job subclassification dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job Sub-Classification Options/All Engineering'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job Sub-Classification Options/All Engineering'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Education level dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Education level dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Education Level Options/Bachelors'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Education Level Options/Bachelors'))

String[] field = findTestData("Fields").getAllData()

int randomField = new Random().nextInt(field.length + 1)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Field of study input'), findTestData("Fields").getValue("Field of studies", randomField))

WebUI.scrollToElement(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job summary Description input'), 5)

String[] summary = findTestData("Summary").getAllData()

int randomSummary = new Random().nextInt(summary.length)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job summary Description input'), findTestData("Summary").getValue("Summary", randomSummary))

WebUI.scrollToElement(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job description input'), 5)

String[] jobDescription = findTestData("WorkExperienceDescriptions").getAllData()

int randomJobDescription = new Random().nextInt(jobDescription.length)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Job description input'), findTestData("WorkExperienceDescriptions").getValue("Descriptions", randomJobDescription))

WebUI.scrollToElement(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Pay period dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Pay period dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Pay Period Options/Monthly'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Pay Period Options/Monthly'))

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Minimum rate input'), '1000')

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Maximum rate input'), '10000')

WebUI.scrollToElement(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Skill input'), 5)

String[] skill = findTestData("Skills").getAllData()

int randomSkill = new Random().nextInt(skill.length + 1)

WebUI.setText(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Skill input'), findTestData("Skills").getValue("Skills", randomSkill))

WebUI.scrollToElement(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Skill level dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Skill level dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Skill Level Options/Advanced option'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Skill Level Options/Advanced option'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Importance dropdown'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Importance dropdown'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Importance Options/Required'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Importance Options/Required'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Add skill button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Add skill button'))

WebUI.scrollToElement(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Publish button'), 5)

WebUI.click(findTestObject('Object Repository/Employer Object Repository/Employer Post a Job OR/Publish button'))