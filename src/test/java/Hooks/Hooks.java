package Hooks;

import factory.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Hooks {
    WebDriver driver;
    public static FileReader fr;

    @Before
    public void start() throws IOException {
        if (driver == null) {
            fr = new FileReader("D:/SendMessages/src/test/java/utilities/config.properties");
            Properties prop = new Properties();
            prop.load(fr);
            driver = driverfactory.setup();
            driver.get(prop.getProperty("url"));
        }
    }
    @After
    public void teardown(){
        if (driver!= null) {
            driver.quit();
        }
    }
}
