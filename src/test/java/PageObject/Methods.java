package PageObject;

import base.Driver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

public class Methods extends Driver {

    public static final Logger logger = LogManager.getLogger(Methods.class);

    private WebElement element;

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void clickByLocator(String locator, String locVal) {
        try {
            switch (locator) {
                case "className" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.className(locVal));
                    element.click();
                    break;
                case "cssSelector" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.cssSelector(locVal));
                    element.click();
                    break;
                case "xpath" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.xpath(locVal));
                    element.click();
                    break;
                case "id" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.id(locVal));
                    element.click();
                    break;
            }
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void sendKeysByLocator(String locator, String locVal, String keys) {
        try {
            switch (locator) {
                case "className" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.className(locVal));
                    element.sendKeys(keys);
                    break;
                case "cssSelector" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.cssSelector(locVal));
                    element.sendKeys(keys);
                    break;
                case "xpath" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.xpath(locVal));
                    element.sendKeys(keys);
                    break;
                case "id" :
                    Thread.sleep(3000);
                    element = driver.findElement(By.id(locVal));
                    element.sendKeys(keys);
                    break;
            }
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public String getText(By by){
        String actual = "";
        actual = driver.findElement(by).getText();
        return actual;
    }

    public void switch2NextPage() {
        String currentTab = driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        int index = tabs.indexOf(currentTab);
        driver.switchTo().window((String) tabs.get(index + 1)); // switch to next page
    }
}
