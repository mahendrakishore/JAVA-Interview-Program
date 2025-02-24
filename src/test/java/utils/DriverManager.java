package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DriverManager {

   public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
            WebDriverManager.firefoxdriver().setup(); // Downloads and sets up GeckoDriver

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized"); // Open in maximized mode
            // options.addArguments("--headless"); // Uncomment for headless execution

            driver = new FirefoxDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
