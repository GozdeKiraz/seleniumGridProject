import org.junit.After;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ParallelTest2 extends BaseTest {
    @Test
    public void testChrome2() throws MalformedURLException {
        driver = new BaseTest().getDriver("chrome");
        driver.navigate().to("http://www.yahoo.com/");
        driver.manage().window().maximize();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
