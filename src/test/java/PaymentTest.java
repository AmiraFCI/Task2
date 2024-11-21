import Pages.paymentPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends testBase{


    @Test
    public void payment()
    {
        new paymentPage(driver).Payment();
        String Url = testBase.driver.getCurrentUrl();
        Assert.assertEquals(Url,"https://ksrtc.in/oprs-web/booking/revamp/paxInfo.do");

    }
}
