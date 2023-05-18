package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.Duration;

public class driverfactory {
     static WebDriver driver;
//driver initialised based on the input given in the env variable value of browser
    public static void setup() throws IOException {
        if (driver == null) {
            switch (System.getenv("browser")) {
                case ("firefox"):
                    System.out.println("Browser value from env variable: " + System.getenv("browser"));
                    driver = WebDriverManager.firefoxdriver().create();
                    break;
                case ("chrome"):
                    System.out.println("Browser value from env variable: " + System.getenv("browser"));
                    driver = WebDriverManager.chromedriver().create();
                    break;
                case ("edge"):
                    System.out.println("Browser value from env variable: " + System.getenv("browser"));
                    driver = WebDriverManager.edgedriver().create();
                    break;
                case ("chromium"):
                    System.out.println("Browser value from env variable: " + System.getenv("browser"));
                    driver = WebDriverManager.chromiumdriver().create();
                    break;
                default:
                    System.out.println("Browser value from env variable: " + System.getenv("browser"));
                    System.out.println("This browser hasn't been implemented yet");
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
}

