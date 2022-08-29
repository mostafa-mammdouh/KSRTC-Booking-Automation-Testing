    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.ui.Select;

    public class PaymentPage  extends PageBase{
        Select select;
        public PaymentPage(WebDriver driver) {
            super(driver);
        }
        @FindBy(name = "cnumber")
        WebElement CardNumber ;

        @FindBy(name = "cvv2")
        WebElement CVV ;

        @FindBy(name = "cname2")
        WebElement CardHolder ;

        @FindBy(xpath = "//select[@name='expmon']")
        WebElement  MonthDropDown;

        @FindBy(xpath = "//select[@name='expyr']")
        WebElement  YearDropDown ;

        public void CardNumber (String card)
        {
            CardNumber.sendKeys(card);
        }

        public void CVV (String card)
        {
            CardNumber.sendKeys(card);
        }

        public void CardHolder (String card)
        {
            CardNumber.sendKeys(card);
        }


        public void MonthClick ()
        {
           select = new Select(MonthDropDown);
           select.selectByIndex(1);
        }

        public void YearClick ( )
        {
            select = new Select(MonthDropDown);
            select.selectByIndex(1);
        }
    }
