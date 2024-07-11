package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Utils;
public class FirstTest extends BaseTest{

    @Test
    public void testLogin() {
        Utils.loginPage(driver);
    }
}
