package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setUpClasses.AbstractPage;

public class Forms extends AbstractPage {

    /* Form webform-client-form-6101 located in the following pages:
        Homepage - http://www.integrativenutrition.com/

    */

    //First Name text box
    @FindBy(id = "edit-submitted-firstname")
    private static WebElement form6101Name;
    public static void fill6101Name(String name){
        form6101Name.click();
        form6101Name.sendKeys(name);
    }

    //Email text box
    @FindBy(id = "edit-submitted-email")
    private static WebElement form6101Email;
    public static void fill6101Email(String email){
        form6101Email.click();
        form6101Email.sendKeys(email);
    }

    //Call checkbox
    @FindBy(id = "edit-submitted-please-call-c-1")
    private static WebElement form6101CheckBox;
    public static void phone6101Box(){
        form6101CheckBox.click();
    }

    //Country flag dropdown
    @FindBy(xpath = ".//*[@id='webform-component-Home-Phone--c']/div[1]/div/div/div[1]")
    private static WebElement form6101Flag;
    public static void select6101Flag(){
        form6061Flag.click();
    }

    //Phone text field
    @FindBy(id = "edit-submitted-home-phone-c")
    private static WebElement form6101Phone;
    public static void enter6101Phone(String phone){
        form6101Phone.click();
        form6101Phone.sendKeys(phone);
    }

    //Get Started Button
    @FindBy(id = "edit-submit")
    private static WebElement form6101Submit;
    public static void click6101SubmitButton(){
        form6101Submit.click();
    }

    //Privacy Policy link
    @FindBy(xpath = ".//*[@id='webform-client-form-6101']/div/p/small/a")
    private static WebElement form6101privacy;
    public static void click6101PrivacyLink(){
        form6101privacy.click();
    }


    /* Form webform-client-form-6061 located in the following pages:
        Curriculum page - http://www.integrativenutrition.com/curriculum
        Health Coaching page - http://www.integrativenutrition.com/health-coaching

    */

    //First Name text box
    @FindBy(id = "edit-submitted-firstname")
    private static WebElement form6061Name;
    public static void fill6061Name(String name){
        form6061Name.click();
        form6061Name.sendKeys(name);
    }

    //Email text box
    @FindBy(id = "edit-submitted-email")
    private static WebElement form6061Email;
    public static void fill6061Email(String email){
        form6101Email.click();
        form6101Email.sendKeys(email);
    }

    //Call checkbox
    @FindBy(id = "edit-submitted-please-call-c-1")
    private static WebElement form6061CheckBox;
    public static void checkPhonBox(){
        form6101CheckBox.click();
    }

    //Country flag dropdown
    @FindBy(xpath = ".//*[@id='webform-component-Home-Phone--c']/div[1]/div/div/div[1]")
    private static WebElement form6061Flag;
    public static void select6061Flag(){
        form6061Flag.click();
    }

    //Phone text field
    @FindBy(id = "edit-submitted-home-phone-c")
    private static WebElement form6061Phone;
    public static void enter6061Phone(String phone){
        form6061Phone.click();
        form6061Phone.sendKeys(phone);
    }

    //Get Started Button
    @FindBy(id = "edit-submit")
    private static WebElement form6061Submit;
    public static void click6061SubmitButton(){
        form6101Submit.click();
    }

    //Privacy Policy link
    @FindBy(xpath = ".//*[@id='webform-client-form-6061']/div/p/small/a")
    private static WebElement form6061Privacy;
    public static void click6061PrivacyLink(){
        form6061Privacy.click();
    }


     /*
        This is where Joshuas Info Session form will gio
    */


     /* Form webform-client-form-6061 located in the following pages:
        Curriculum page - http://www.integrativenutrition.com/curriculum
        ////
    */

    }
