import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentPageTest extends TestBase {
    PaymentPage paymentPage ;

    @Test(priority = 4)
    public void PaymentWithValidCardNumber ()
    {
        paymentPage = new PaymentPage(driver);
        paymentPage.CardNumber.clear();
        paymentPage.CardNumber("5425233430109903");
        paymentPage.CVV.clear();
        paymentPage.CVV("123");
        paymentPage.CardHolder.clear();
        paymentPage.CardHolder("Mostafa");
        paymentPage.MonthClick();
        paymentPage.YearClick();

        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    public void PaymentWithInValidCardNumber ()
    {
        paymentPage = new PaymentPage(driver);
    /*    paymentPage.CVV("123");
        paymentPage.CardHolder("Mostafa");
        paymentPage.MonthClick();
        paymentPage.YearClick();*/
        paymentPage.CardNumber("123456");
        Assert.assertTrue(driver.switchTo().alert().getText().contains("Sorry"));
        driver.switchTo().alert().dismiss();
    }


}