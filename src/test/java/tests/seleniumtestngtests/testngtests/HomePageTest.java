package tests.seleniumtestngtests.testngtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HomePageTest extends BaseTest {

    @Test
    public void testPageTitleName() {
        String expectedTitle = "Products";
        String actualTitle = driver.findElement(By.className("title")).getText();

        Assert.assertEquals(actualTitle, expectedTitle, "Page title is incorrect");
    }

    @Test
    public void testCheckItemName() {
        List<String> expectedNames = Arrays.asList("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)");
        //List<WebElement> itemsproduct = driver.findElement(By.xpath("//div[@class = 'inventory_list']")).findElements(By.xpath("//div[@class = 'inventory_item']"));
        List<WebElement> itemsproduct = driver.findElement(By.xpath("//div[@class = 'inventory_list']")).findElements(By.xpath("//div[@class = 'inventory_item_name ']"));
        for (int i = 0; i < itemsproduct.size(); i++) {
            //System.out.println(itemsproduct.get(i).getText());
            String actualName = itemsproduct.get(i).getText();
            Assert.assertEquals(actualName, expectedNames.get(i), "Wrong name");
        }
    }


    @Test
    public void testCheckItemPrice() {
        //List<WebElement> itemsproduct = driver.findElement(By.xpath("//div[@class = 'inventory_list']")).findElements(By.xpath("//div[@class = 'inventory_item']"));
        List<WebElement> itemsPrice = driver.findElement(By.xpath("//div[@class = 'inventory_list']")).findElements(By.xpath("//div[@class = 'inventory_item_price']"));
        for (int i = 0; i < itemsPrice.size(); i++) {
            String actualPrice = itemsPrice.get(i).findElement(By.xpath("//div[@class = 'inventory_item_price']")).getText();
            // Використовуємо StringBuilder для обробки ціни
            StringBuilder priceBuilder = new StringBuilder(actualPrice);
            // Перевіряємо, що перший символ є символом "$"
            Assert.assertEquals(priceBuilder.charAt(0), '$', "The first character is not a dollar sign.");
            // Перевіряємо, що після долара йдуть цифри (видаляємо символ долара)
            String priceWithoutDollar = priceBuilder.deleteCharAt(0).toString();
            // Перевіряємо, що залишився рядок складається з чисел з десятковим форматом
            Assert.assertTrue(priceWithoutDollar.matches("\\d+\\.\\d{2}"), "Price format is incorrect: " + priceWithoutDollar);
        }
    }
}
