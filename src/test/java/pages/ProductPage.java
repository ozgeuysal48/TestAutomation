package pages;

import PageObject.Methods;

import java.util.Random;

public class ProductPage extends Methods {

    public void searchWatch(){
        clickByLocator("className", "V8wbcUhU");
        sendKeysByLocator("className", "V8wbcUhU", "Saat" );
        clickByLocator("className", "cyrzo7gC");
        logger.info("User searched for a watch");

    }

    public void selectWatch() throws InterruptedException {
        Random random = new Random();
        clickByLocator("xpath", "(//div[@class='image-overlay-body'])[" + random.nextInt(5) + "]");
        switch2NextPage();
        Thread.sleep(1000);
        driver.get(driver.getCurrentUrl());
        logger.info("User selected a random watch");

    }

    public void addBasket() throws InterruptedException {
        Thread.sleep(2000);
        clickByLocator("cssSelector",".add-to-basket-button-text");
        logger.info("User added a watch to the basket");
    }




}
