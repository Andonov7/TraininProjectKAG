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

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/div_Approve a request on my Microsoft Authe_596d4b (16)'))

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Advanced Filter___BVID__24 (16)'), 'katalon tp')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_View (16)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/a_Subscription (15)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_View_1 (4)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Edit (3)'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_data-exchange/select_Real TimeScheduled (2)'), 'Scheduled', 
    false)

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Save (16)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Add Schedule'))

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Frequency_date'), '01/01/2022')

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Frequency_time'), '6:00')

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Frequency_time_1'), '11:59')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_data-exchange/select_Select. AmericaAdakAmericaChicagoAme_a55da8'), 
    'America/New_York', true)

WebUI.setText(findTestObject('Object Repository/Page_data-exchange/input_Frequency___BVID__136'), '3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_data-exchange/select_Select. Second(s)Minute(s)Hour(s)Day(s)'), 
    'minutes', true)

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Add (12)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Edit_1'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/input_Frequency_time_1'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_AM'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Remove (1)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/button_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Page_data-exchange/div_No Schedules'))

WebUI.closeBrowser()

