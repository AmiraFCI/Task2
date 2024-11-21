package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class bookingTicket extends pageBase {

    public WebDriver driver;

    //Choose arrival date
    private final By Arrive_Date = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]");

    //Click Search Button
    private final By Search = By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button");

    public bookingTicket(WebDriver driver) {
        super(driver);
    }

    public bookingTicket chooseBengaluru() {
        Actions A = new Actions(driver);
        A.sendKeys(Keys.PAGE_DOWN).build().perform();
        WebElement Choose = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")));
        Choose.click();
        return this;

    }

    public bookingTicket chooseArriveDate()
    {
        driver.findElement(Arrive_Date).click();
        return this;
    }
        public bookingTicket ClickonSearch()
        {
            driver.findElement(Search).click();
            return this;
        }
    public boolean Checkifresultsuccessfully()
    {
        try {
            return driver.findElement(this.Arrive_Date).isDisplayed();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    }
