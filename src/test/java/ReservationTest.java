import Pages.ReservationPage;
import Pages.bookingTicket;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReservationTest extends testBase{


    @Test
    public void reservtion() throws InterruptedException {
        new ReservationPage(driver).Reservation()
                .Passenger_details();

        String Url = testBase.driver.getCurrentUrl();
        Assert.assertEquals(Url,"https://ksrtc.in/oprs-web/booking/revamp/paxInfo.do");
    }
}
