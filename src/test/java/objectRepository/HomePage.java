package objectRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class HomePage extends AbstractPage {

    //*** Homepage Modal a ***************************************************************************************

    //Close button - home page modal a
    @FindBy(xpath = "//button[@data-dismiss='modal']")
    public static WebElement modalAcloseButton;
    public static void closeModalA(){modalAcloseButton.click();}

    //Name field - home page modal A
    @FindBy(xpath = ".//*[@id='edit-submitted-firstname--2']")
    private static WebElement modalAfirstName;
    public static void modalAName(String name){modalAfirstName.sendKeys(name);}

    //Email field - home page modal A
    @FindBy(xpath = ".//*[@id='edit-submitted-email--2']")
    private static WebElement modalAemail;
    public static void modalAEmail(String email){modalAemail.sendKeys(email);}

    //Phone field - home page modal A
    @FindBy(xpath = ".//*[@id='edit-submitted-home-phone-c--2']")
    private static WebElement modalAphone;
    public static void modalAPhone(String phoneNumber){modalAphone.sendKeys(phoneNumber);}

    //Country flag field - home page modal A
    @FindBy(xpath = ".//*[@class='selected-flag']")
    private static WebElement modalAflag;
    public static void clickModalAFlag(String phoneNumber){modalAflag.click();}

    //Get Started button - home page modal A
    @FindBy(xpath = ".//*[@id='edit-submitted-home-phone-c--2']")
    private static WebElement modalAgetStarted;
    public static void clickModalAButton(){modalAgetStarted.click();}

    //Privacy Policy link - home page modal A
    @FindBy(xpath = ".//*[@id='edit-submitted-home-phone-c--2']")
    private static WebElement modalAprivacy;
    public static void clickPrivacyPolicy(){modalAprivacy.click();}





}
