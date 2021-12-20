package addtocart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Cart
{

    @Test(dataProvider="ProductName",dataProviderClass = Data.class)
    public static void testAddToCart(String product) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(product))).click();
        System.out.println(product + " added to cart");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Add to cart']"))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.quit();
    }
}
