package steps;

import base.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Hooks extends Driver {

    private static final Logger logger = LogManager.getLogger(Driver.class);

    @Before
    public void setUp(){
        initializeDriver();
        logger.info("Test started");
    }

    @After
    public void tearDown(){
        closeDriver();
        logger.info("Test completed.");
    }

}
