import org.junit.After;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ParallelTest1 extends BaseTest{
    @Test
    public void testChrome1() throws MalformedURLException {
       driver = new BaseTest().getDriver("chrome");
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    //Firefox Test
    @Test
    public void testFirefox1() throws MalformedURLException {
        driver = new BaseTest().getDriver("firefox");
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

}
