import com.sun.xml.internal.rngom.parse.host.Base;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class GridTest  {



        @Test
        public void runAllTests() {
            Class<?>[] classes = {ParallelTest1.class,ParallelTest2.class};

            // ParallelComputer(true,true) will run all classes and methods
            // in parallel.  (First arg for classes, second arg for methods)
            // I set true, true this means classes and methods runs in parallel.
            JUnitCore.runClasses(new ParallelComputer(true, true), classes);
        }
    }








