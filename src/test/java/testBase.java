import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class testBase {

    static WebDriver driver;
    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

    }
}
