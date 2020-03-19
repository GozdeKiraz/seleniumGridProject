import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public WebDriver driver;

    public WebDriver getDriver(String browser) throws MalformedURLException {
        //Set Browser Type


        DesiredCapabilities caps = null;

        if (browser == "chrome") {
           // System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
           // driver=new ChromeDriver();
            caps = DesiredCapabilities.chrome();
        } else if (browser == "firefox") {
            //System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
           // driver=new FirefoxDriver();
            caps = DesiredCapabilities.firefox();
        }
        caps.setPlatform(Platform.MAC);

        return driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), caps);
    }
}
