package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class paymentPage extends pageBase{
    public paymentPage(WebDriver driver) {
        super(driver);
    }

    private final By Visa = By.xpath("//*[@id=\"form-common\"]/div[1]/div[1]/div/div/div[2]/div/button[1]/div");
    private final By CartNumber = By.id("card_number");
    private final By CartExpiry = By.id("card_expiry");
    private final By CVV_Number = By.id("card_cvv");


    // payment

    public paymentPage Payment() {



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(Visa));

        driver.findElement(CartNumber).sendKeys("1426312569874123");
        driver.findElement(CartExpiry).sendKeys("1230");
        driver.findElement(CVV_Number).sendKeys("611");
        return this;


    }
}
