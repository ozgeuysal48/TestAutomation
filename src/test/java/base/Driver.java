package base;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.logging.Level;

public class Driver {
    public static WebDriver driver;

    @BeforeClass
    public void initializeDriver() {
        System.setProperty("webdriver.opera.driver", "Driver/operadriver.exe");
        System.setProperty("webdriver.opera.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        OperaOptions options = new OperaOptions();
        //Notifications Close
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-notifications");
        options.addArguments("--acceptInsecureCerts");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("chrome.switches","--disable-extensions");
        options.merge(desiredCapabilities);
        driver = new OperaDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/");
    }

    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
