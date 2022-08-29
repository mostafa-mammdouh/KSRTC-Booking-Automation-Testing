import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public static WebDriver driver;
@BeforeTest
    public void SetupDrive() throws InterruptedException{
    WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1”");
Thread.sleep(4000);
}
@AfterTest
    public void CloseDriver()
{
    driver.quit();
}
}
