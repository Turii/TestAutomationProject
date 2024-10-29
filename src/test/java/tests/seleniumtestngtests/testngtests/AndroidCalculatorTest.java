package tests.seleniumtestngtests.testngtests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.URL;

public class AndroidCalculatorTest {
    private AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws Exception {
        // Налаштування для емулятора Android і стандартної програми Калькулятор
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.android.calculator2");  // Стандартний пакет Калькулятора на Android
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        // Підключення до локального Appium сервера
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @Test
    public void testAddition() {
        // Введення операції додавання: 2 + 3
        MobileElement two = driver.findElementById("com.android.calculator2:id/digit_2");
        two.click();
        MobileElement plus = driver.findElementByAccessibilityId("plus");
        plus.click();
        MobileElement three = driver.findElementById("com.android.calculator2:id/digit_3");
        three.click();
        MobileElement equals = driver.findElementByAccessibilityId("equals");
        equals.click();

        // Перевірка результату
        MobileElement result = driver.findElementById("com.android.calculator2:id/result");
        assert result.getText().equals("5");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
