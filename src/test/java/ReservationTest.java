import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ReservationTest extends TestBase{
    ReservationPage reservationPage;

    @Test (priority = 2)
    public void HappyScenario() {
        driver.navigate().back();
reservationPage = new ReservationPage(driver);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
reservationPage.CitySelect();
reservationPage.DateSelect();
reservationPage.SearchForBusButton();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
reservationPage.SeatSelect();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
reservationPage.BoardingPointSelect();
reservationPage.DroppingPointButton();
reservationPage.DroppingPointSelect();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
reservationPage.MobileAdd("6789125987");
reservationPage.EmailAdd("qwe@gmail.com");
reservationPage.NameAdd("mostafa");
reservationPage.GenderDropdown();
reservationPage.GeeralrDropdown();
reservationPage.AgeAdd("23");
reservationPage.MakePaymentClick();

    }
    @Test(priority = 1)
   public void InvalidRedirectBus()
    {
        reservationPage = new ReservationPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        reservationPage.CitySelect();
        reservationPage.DateSelect();
        reservationPage.SearchForBusButton();
        Assert.assertFalse(driver.findElement(By.xpath("(//input[@class = 'btnSelectLO select-service-btn']) [1]")).getText().contains("Taxi"));
    }

}
