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

WebUI.navigateToUrl('https://dx-portal.qa.thekag.com/')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Approve a request on my Microsoft Authe_596d4b (5)'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Advanced Filter___BVID__24 (5)'), 'katalon trading')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_View (5)'))

WebUI.click(findTestObject('Object Repository/KAG Portal/Page_data-exchange/a_Subscription (4)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_View_1 (2)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Add Transmission'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_data-exchange/select_Select.EmailFile Transfer ProtocolNe_92efe9'), 
    '1', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_data-exchange/select_Select.DTNDelimitedImage'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_data-exchange/select_Select.Adobe PDF (pdf)Text Document _99c46b'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Description___BVID__136'), 'Katalon transmission')

WebUI.click(findTestObject('Object Repository/KAG Portal/Page_data-exchange/button_Add Email'))

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Email Address_emailInput'), 'des@thekag.com')

WebUI.click(findTestObject('Object Repository/KAG Portal/Page_data-exchange/button_Add Email Address'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Save (5)'))

WebUI.verifyTextPresent('Edit Transmission', false)

WebUI.closeBrowser()

