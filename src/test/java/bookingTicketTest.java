import Pages.bookingTicket;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bookingTicketTest  extends testBase{




    @Test
    public void BookingTest(){

       new bookingTicket(driver)
               .chooseBengaluru()
               .chooseArriveDate()
               .ClickonSearch();
        Assert.assertTrue(new bookingTicket(driver).Checkifresultsuccessfully());
    }
}
