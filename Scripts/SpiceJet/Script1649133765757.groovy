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

WebUI.navigateToUrl('https://www.spicejet.com/')

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/input_To_css-1cwyjr8 r-homxoj r-ubezar r-10_bc3a6f'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_Select Date'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_Passengers'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_1 Adult'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_1 Adult'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_more than 12 years_r-1awozwy r-19m6qjp _532c5a'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_more than 12 years_r-1awozwy r-19m6qjp _532c5a'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_INR'))

WebUI.click(findTestObject('Object Repository/Page_SpiceJet - Flight Booking for Domestic_5bd1dc/div_Search Flight'))

WebUI.closeBrowser()

