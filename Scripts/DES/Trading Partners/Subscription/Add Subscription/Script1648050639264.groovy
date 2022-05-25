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

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Approve a request on my Microsoft Authe_596d4b (3)'))

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Advanced Filter___BVID__24 (3)'), 'katalon trading')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_View (3)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/a_Subscription (2)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Add Subscription (1)'))

WebUI.selectOptionByLabel(findTestObject('Page_data-exchange/select_Select a Transaction TypeFinancial D_fcbdd8'), 'Invoice (INV)', 
    false)

WebUI.selectOptionByValue(findTestObject('Page_data-exchange/select_Select.Outbound'), 'out', true)

WebUI.selectOptionByValue(findTestObject('Page_data-exchange/select_Select.Real TimeScheduled'), 'true', true)

WebUI.setText(findTestObject('Page_data-exchange/input_Description___BVID__93'), 'Katalon testing')

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Add Bill To (2)'))

WebUI.doubleClick(findTestObject('Page_data-exchange/td_13THMIL'))

WebUI.doubleClick(findTestObject('Page_data-exchange/td_2001OILC'))

WebUI.doubleClick(findTestObject('Page_data-exchange/td_21STCENT'))

WebUI.click(findTestObject('Page_data-exchange/button_Add'))

WebUI.click(findTestObject('Page_data-exchange/button_Save'))

WebUI.closeBrowser()

