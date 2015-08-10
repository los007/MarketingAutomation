package objectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.AbstractPage;
import sun.jvm.hotspot.debugger.Page;

public class Header extends AbstractPage {
    //Home icon
    @FindBy(xpath = ".//*[@id='navbar']/div[2]/div/div[1]/a/span[1]")
    private static WebElement home;
    public static void clickHomeIcon(){home.click();
    PageFactory.initElements(driver, new HomePage());}

    //Curriculum icon
    @FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[1]/a")
    private static WebElement curriculum;
    public static void clickCurriculumIcon(){curriculum.click();
    PageFactory.initElements(driver, new CurriculumPage());}

    //Info sessions icon
    @FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[2]/a")
    private static WebElement info;
    public static void clickInfoSessionsIcon(){info.click();
    PageFactory.initElements(driver, new InfoSessionsPage());}

    //Health Coaching icon
    @FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[3]/a")
    private static WebElement healthCoach;
    public static void clickHealthCoachIcon(){healthCoach.click();
    PageFactory.initElements(driver, new HealthCoachingPage());}


   //About Us
    @FindBy (xpath = ".//*[@id='navbar']/div[2]/div/div[2]/nav/ul/li[4]/a")
    private static WebElement about;
    public static void clickAboutUsIcon(){about.click();
    PageFactory.initElements(driver, new AboutUsPage());}

    //Contact Us
    @FindBy (xpath = ".//*[@id='secondary-menu']/li/a")
    private static WebElement contact;
    public static void clickContactUsIcon(){contact.click();
    PageFactory.initElements(driver, new ContactUsPage());}

    //Search
    @FindBy (id = "edit-search-block-form--2")
    private static WebElement search;
    public static void conductSearch(String input){
        search.sendKeys(input);
        search.sendKeys(Keys.RETURN);}


}
