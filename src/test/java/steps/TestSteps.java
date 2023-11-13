package steps;

import base.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.BasketPage;
import pages.BasketPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class TestSteps {

    private static final Logger LOGGER = LogManager.getLogger(Driver.class);

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    BasketPage basketPage = new BasketPage();

    String url = "https://www.trendyol.com/";

    @Given("^Go to www.trendyol.com$")
    public void open_the_website() throws InterruptedException {
        homePage.acceptCookies();
    }

    @When("^Check that the main page is opened$")
    public void mainPage() throws Exception {
        homePage.checkHomePage();
    }

    @Then("^I click Giris Yap button$")
    public void loginButton() {
        homePage.clickLoginButton();
    }

    @Then("^I type 'ozge@uysal.com' in 'email'$")
    public void typeMail() {
        loginPage.sendUsername();
    }

    @Then("I type '123456' in 'password'")
    public void typePassword(){
        loginPage.sendPassword();
    }

    @And("I click on Giris Yap button")
    public void clickLogin() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(3000);
    }

    @Then("I should see 'E-mail or password is incorrect")
    public void checkInvalidLoginAttemp(){
        loginPage.invalidLoginAttemp();
    }

    @Then("I search for a 'saat'")
    public void searchWatchItem() throws InterruptedException {
        productPage.searchWatch();
        Thread.sleep(3000);
    }

    @And("I select a random watch")
    public void selectRandomWatch() throws InterruptedException {
        productPage.selectWatch();

    }

    @And("I add to basket selected watch")
    public void addToBasket() throws InterruptedException {
        productPage.addBasket();
    }

    @And("I go to my Basket")
    public void myBasket(){
        basketPage.basket();
    }

    @And("I increase the number of watch in the basket to the two")
    public void increaseItem(){
        basketPage.increaseBasket();
    }

    @And("I delete the all items in the basket")
    public void deleteAllItems(){
        basketPage.deleteBasket();
    }


}
