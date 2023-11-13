package pages;

import PageObject.Methods;
import org.openqa.selenium.By;

public class LoginPage extends Methods {

    public void sendUsername(){
        sendKeysByLocator("id","login-email", "ozge@uysal.com");
        logger.info("User entered wrong UserName");
    }

    public void sendPassword(){
        sendKeysByLocator("id","login-password-input","1234");
        logger.info("User entered wrong Password");
    }

    public void clickLoginButton() throws InterruptedException {
        clickByLocator("xpath", "//button[@type='submit']//span[contains(text(),'Giriş Yap')]");
        logger.info("User clicked to Login Button");
    }

    public void invalidLoginAttemp(){
        String expected = "E-posta adresiniz ve/veya şifreniz hatalı.";
        By by = By.xpath("//span[@class='message']");
        String actual = getText(by);
        if(actual.equals(expected)){
            System.out.println("Login failed with authentication error. Go next step");
        }
        logger.info("'E-posta adresiniz ve/veya şifreniz hatalı.' message is appeared");
    }
}
