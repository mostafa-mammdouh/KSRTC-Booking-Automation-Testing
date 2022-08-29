import com.beust.ah.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.model.Value;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage extends PageBase{
    Select select;
    public ReservationPage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "(//a[@href ='#']) [18]")
    WebElement City;

    @FindBy(xpath = "(//a[@class ='ui-state-default']) [3]")
    WebElement Date;

    @FindBy(xpath = "//button[@class ='btn btn-primary btn-lg btn-block btn-booking']")
    WebElement SearchForBus;

    @FindBy(xpath = "(//input[@class = 'btnSelectLO select-service-btn']) [1]")
    WebElement Seat;

    @FindBy(xpath = "(//li[@class= 'availSeatClassS'])[1]")
    WebElement BoardingPoint;

    @FindBy(xpath = "//a[@class = 'nav-link tabopacity']")
    WebElement DroppingPoint;

    @FindBy(xpath = "(//li[@class = 'p-2 Forward-droping']) [1]")
    WebElement CheckBoxPoint;

    @FindBy(xpath = "(//input[@class = 'form-control']) [1]")
    WebElement Mobile;

    @FindBy(id = "email")
    WebElement Email;

    @FindBy(name = "passengerName")
    WebElement Name;

    @FindBy(id = "genderCodeIdForward0")
    WebElement DropDown;

    @FindBy(id = "passengerAgeForward0")
    WebElement Age;

@FindBy(id = "concessionIdsForward0")
    WebElement General;


@FindBy(id = "PgBtn")
    WebElement MakePayment;
public void CitySelect()
{
City.click();
}

public void DateSelect()
{
    Date.click();
}

public void SearchForBusButton()
{
    SearchForBus.click();
}

public void SeatSelect()
{
    Seat.click();
}

public void BoardingPointSelect()
{
BoardingPoint.click();
}

public void DroppingPointButton()
{
    DroppingPoint.click();
}

public void DroppingPointSelect()
{
    CheckBoxPoint.click();
}

public void MobileAdd(String l )
{
    Mobile.sendKeys(l);
}

public void EmailAdd(String e)
{
    Email.sendKeys(e);
}

public void NameAdd(String n)
{
    Name.sendKeys(n);
}
public void GenderDropdown()
{
    select = new Select(DropDown);
    select.selectByVisibleText("MALE");
}
    public void GeeralrDropdown()
    {
        select = new Select(General);
        select.selectByVisibleText("GENERAL PUBLIC");
    }


public void  AgeAdd(String a)
{
    Age.sendKeys(a);
}


    public void  MakePaymentClick()
    {
        MakePayment.click();
    }
    }