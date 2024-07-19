package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utils {

    public static WebDriver createDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless", "--window-size=1920,1080");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        return new ChromeDriver(chromeOptions);
    }

    public static void loginPage(WebDriver driver) {
        driver.get("https://www.saucedemo.com/");
    }

    public static void takeScreenshot(WebDriver driver, String methodName, String className) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_hhmmss");
        String date = simpleDateFormat.format(new Date());

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(String.format("screenshots/screenshot_%s_%s_%s.png", className, methodName, date)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}