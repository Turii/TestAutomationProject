package tests.seleniumtestngtests.testngtests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void testPageTitleName() {
        String expectedTitle = "Products";
        String actualTitle = driver.findElement(By.className("title")).getText();

        Assert.assertEquals(actualTitle, expectedTitle, "Page title is incorrect");
    }
}
