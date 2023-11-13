package pages;

import PageObject.Methods;

public class HomePage extends Methods {

    // Accept cookies first
    public void acceptCookies() {
        clickByLocator("id", "onetrust-accept-btn-handler");
        logger.info("Accepted all cookies");

    }

    public void clickLoginButton() {
        clickByLocator("className", "link-text");
        logger.info("Clicked Login button");

    }

    public void checkHomePage() throws Exception {
        String expectedTitle = "Trendyol";
        try{
            assert driver.getTitle().contains(expectedTitle);
            logger.info("Actual title: "                  + driver.getTitle() + "\n" +
                        "Expected title should contain: " + expectedTitle + " \n" +
                        "Trendyol Page is opened ");
        }
        catch (AssertionError assertionError){
            throw new Exception("AssertionError. \n" +
                                "Actual title: "     + driver.getTitle() + "\n" +
                                "Expected title: "   + expectedTitle);
        }
    }
}
