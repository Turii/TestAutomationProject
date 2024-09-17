package tests.seleniumtestngtests.testngtests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumPracticeTest {
    //https://bonigarcia.dev/selenium-webdriver-java/
    //@Override
    //protected String getBaseUrl() {
    //    return "https://bonigarcia.dev/selenium-webdriver-java/";
    //}
    WebDriver driver;
    String sutUrl = "https://bonigarcia.dev/selenium-webdriver-java/";

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get(sutUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void loginToSlowLogin(WebDriver driver, WebDriverWait wait, String username, String password) {
        driver.findElement(By.xpath("//a[@href = 'login-form.html']")).click();
        WebElement loginField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        //WebElement loginField = driver.findElement(By.id("username"));
        //WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@class = 'btn btn-outline-primary mt-2']"));
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }

    @Test
    public void testPageTitle() {
        String expectedText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedText, "Hands-On Selenium WebDriver with Java");
        Assert.assertEquals(driver.getTitle(), "Hands-On Selenium WebDriver with Java");
        Assert.assertEquals(driver.getCurrentUrl(), sutUrl);
        Assert.assertTrue(driver.getPageSource().toLowerCase().contains("</html>"));
    }

    @Test
    public void testSlowLoginSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String successLoginText = "Login successful";

        loginToSlowLogin(driver, wait, "user", "user");

        WebElement loginSuccess = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("success")));
        String actualMessage = loginSuccess.getText().trim();

        Assert.assertEquals(successLoginText, actualMessage);
    }

    @Test
    public void testWrongLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String invalidCredentialsText = "Invalid credentials";

        loginToSlowLogin(driver, wait, "username", "user");

        WebElement loginSuccess = wait.until(ExpectedConditions
                .presenceOfElementLocated(By.id("invalid")));
        String actualMessage = loginSuccess.getText().trim();

        Assert.assertEquals(invalidCredentialsText, actualMessage);
    }
}
