package pages;

import PageObject.Methods;

public class BasketPage extends Methods {

    public void basket(){
        clickByLocator("className","link-text");
        logger.info("User opened the basket");
    }

    public void increaseBasket(){
        clickByLocator("className","ty-numeric-counter-button");
        logger.info("User increased the number of watch in the basket to the two");
    }

    public void deleteBasket(){
        clickByLocator("className","i-trash");
        logger.info("User deleted all the items in the basket");

    }

}
