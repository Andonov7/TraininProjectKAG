import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

System.setProperty('webdriver.chrome.driver', 'C:/Users/aandonov/Desktop/chromedriver.exe')

ChromeOptions options = new ChromeOptions()

options.addExtensions(new File('C:/Users/aandonov/Desktop/ljdobmomdgdljniojadhoplhkpialdid/5.8.3_0.crx'))

DesiredCapabilities caps = new DesiredCapabilities()

caps.setCapability(ChromeOptions.CAPABILITY, options)

WebDriver driver = new ChromeDriver(caps)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('https://google.com')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

