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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.thekag.com/')

WebUI.click(findTestObject('Page Kenan Advantage Group - Tank Truck Tra_92d3f8/a_Apply Now'))

WebUI.click(findTestObject('Object Repository/Page_Join Our Family - Kenan Advantage Group/h2_DRIVERS'))

WebUI.switchToWindowTitle('Online Application Form - The Kenan Advantage Group, Inc.')

WebUI.click(findTestObject('Object Repository/Page_Online Application Form - The Kenan Ad_f1df7f/span_Next'))

WebUI.clickImage(findTestObject('Object Repository/Page_Online Application Form - The Kenan Ad_f1df7f/path'))

WebUI.click(findTestObject('Object Repository/Page_Online Application Form - The Kenan Ad_f1df7f/li_Amarillo'))

WebUI.click(findTestObject('Object Repository/Page_Online Application Form - The Kenan Ad_f1df7f/def_More Information'))

WebUI.click(findTestObject('Object Repository/Page_Online Application Form - The Kenan Ad_f1df7f/def_Select this Position'))

WebUI.click(findTestObject('Object Repository/Page_Online Application Form - The Kenan Ad_f1df7f/def_Personal Information'))

