package tests.seleniumtestngtests.testngtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait5;
    private WebDriverWait wait10;
    private static Properties properties = new Properties();

    @BeforeSuite
    protected void initProperties() {
        boolean isCIRun = System.getenv("CI") != null;  // GitHub Actions sets 'CI' by default
        if (isCIRun) {
            // Fetch secrets from GitHub Actions environment variables
            System.setProperty("S_USERNAME", System.getenv("S_USERNAME"));
            System.setProperty("S_PASSWORD", System.getenv("S_PASSWORD"));
            System.setProperty("BASE_URL", System.getenv("BASE_URL"));
        } else {
            // Load credentials and URL from local.properties for local runs
            try (InputStream inputStream = BaseTest.class.getClassLoader().getResourceAsStream("local.properties")) {
                if (inputStream == null) {
                    System.out.println("ERROR: local.properties file not found.");
                    System.exit(1);
                }
                properties.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.setProperty("S_USERNAME", properties.getProperty("S_USERNAME"));
            System.setProperty("S_PASSWORD", properties.getProperty("S_PASSWORD"));
            System.setProperty("BASE_URL", properties.getProperty("BASE_URL"));
        }
    }
    @BeforeMethod
    public void setup() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        if (System.getenv("CI") == null) {
            driver.manage().window().maximize();
        }
        // Get the URL from the system properties
        String baseUrl = System.getProperty("BASE_URL");
        //String baseUrl = System.getProperty(getBaseUrl());
        //String baseUrl = getBaseUrl();
        driver.get(baseUrl);  // Navigate to the base URL

        // Perform login with credentials
        String username = System.getProperty("S_USERNAME");
        String password = System.getProperty("S_PASSWORD");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    //protected String getBaseUrl() {
    //    return System.getProperty("BASE_URL");
    //}
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

