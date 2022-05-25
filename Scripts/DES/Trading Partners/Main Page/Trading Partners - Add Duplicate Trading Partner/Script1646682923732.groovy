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

WebUI.click(findTestObject('Subscription/Page_Sign in to your account/div_Approve a request on my Microsoft Authe_596d4b'))

WebUI.setText(findTestObject('Subscription/Page_data-exchange/input_Advanced Filter___BVID__24'), 
    'katalon tp')

WebUI.delay(2)

WebUI.click(findTestObject('Subscription/Page_data-exchange/button_View'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/a_Subscription'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/button_Add Subscription'))

WebUI.selectOptionByValue(findTestObject('Subscription/Page_data-exchange/select_Select a Transaction TypeFinancial D_642f55'), 
    '15', true)

WebUI.click(findTestObject('Subscription/Page_data-exchange/label_Active'))

WebUI.selectOptionByValue(findTestObject('Subscription/Page_data-exchange/select_Select.InboundOutbound'), 
    'in', true)

WebUI.selectOptionByValue(findTestObject('Subscription/Page_data-exchange/select_Select.Real TimeScheduled'), 
    'false', true)

WebUI.click(findTestObject('Subscription/Page_data-exchange/button_Add Bill To'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/td_13THMIL'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/td_2001OILC'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/td_21STCENT'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/button_Add'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/button_Save'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/button_Add Schedule'))

WebUI.setText(findTestObject('Subscription/Page_data-exchange/input_Frequency_date'), '03/01/2022')

WebUI.setText(findTestObject('Subscription/Page_data-exchange/input_Frequency_time'), '6:00')

WebUI.setText(findTestObject('Subscription/Page_data-exchange/input_Frequency_time_1'), 
    '11:59')

WebUI.selectOptionByValue(findTestObject('Subscription/Page_data-exchange/select_Select. AmericaAdakAmericaChicagoAme_a55da8'), 
    'America/New_York', true)

WebUI.setText(findTestObject('Subscription/Page_data-exchange/input_Frequency___BVID__188'), 
    '3')

WebUI.selectOptionByValue(findTestObject('Subscription/Page_data-exchange/select_Select. Second(s)Minute(s)Hour(s)Day(s)'), 
    'minutes', true)

WebUI.click(findTestObject('Subscription/Page_data-exchange/label_Monday'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/label_Tuesday'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/label_Wednesday'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/label_Thursday'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/label_Friday'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/button_Add_1'))

WebUI.click(findTestObject('Subscription/Page_data-exchange/span_Scheduled'))

