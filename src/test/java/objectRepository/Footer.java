package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUpClasses.AbstractPage;

public class Footer extends AbstractPage {

    //*** Page Links **********************************************************************************************

    //Curriculum link - click on the link method
    @FindBy(xpath = ".//*[@id='footer-menu-2']/li[1]/a")
    private static WebElement curricLink;
    public static void clickCurriculumLink(){curricLink.click();}
   // PageFactory.initElements(driver, new CurriculumPage());}

    //Learning Center - click on the link method
    @FindBy(xpath = ".//*[@id='footer-menu-2']/li[1]/ul/li[1]/a")
    private static WebElement learningCLink;
    public static void clickLearningCenterLink(){learningCLink.click();}

    //Visiting Teachers - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/curriculum#visitingteachers']")
    private static WebElement visitTeachLink;
    public static void clickVisitingTeachersLink(){visitTeachLink.click();}

    //Business Training - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/curriculum#businesstraining']")
    private static WebElement businessT;
    public static void clickBusinessTrainingLink(){businessT.click();}

    //Health Coaching - click on the link method
    @FindBy(xpath = ".//*[@id='footer-menu-2']/li[2]/a")
    private static WebElement healthCoachingLink;
    public static void clickHealthCoachingLink(){healthCoachingLink.click();}

    //What is a HC - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/health-coaching#definehc']")
    private static WebElement whatsHCLink;
    public static void clickWhatsHCLink(){whatsHCLink.click();}

    //Grad Success - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/health-coaching#gradsuccess']")
    private static WebElement gradSuccessLink;
    public static void clickGradSuccessLink(){gradSuccessLink.click();}

    //Passionate Career - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/health-coaching#careerpassion']")
    private static WebElement careerPassionLink;
    public static void clickCareerPassionLink(){careerPassionLink.click();}

    //Info Sessions - click on the link method
    @FindBy(xpath = ".//*[@id='footer-menu-2']/li[3]/a")
    private static WebElement infoSessLink;
    public static void clickInfoSessionsLink(){infoSessLink.click();}

    //Meet the Founder - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/info-sessions#founder']")
    private static WebElement meetFounderLink;
    public static void clickMeetFounderLink(){meetFounderLink.click();}

    //Student Experience - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/info-sessions#studentexperience']")
    private static WebElement studentExperienceLink;
    public static void clickStudentExperienceLink(){studentExperienceLink.click();}

    //Is HC Right For You - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/info-sessions#hcrightforyou']")
    private static WebElement hcRightLink;
    public static void clickHCRightForYouLink(){hcRightLink.click();}

    //My-Your Healthy - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/info-sessions#healthy']")
    private static WebElement myHealthyLink;
    public static void clickMyYourHealthLink(){myHealthyLink.click();}

    //About Us - click on the link method
    @FindBy(xpath = ".//*[@id='footer-menu-2']/li[4]/a")
    private static WebElement aboutUsLink;
    public static void clickAboutUsLink(){aboutUsLink.click();}

    //Health Revolution - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/about-us#aboutvideo']")
    private static WebElement healthRevLink;
    public static void clickHealthRevLink(){healthRevLink.click();}

    //Core Values - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/about-us#corevalues']")
    private static WebElement coreValuesLink;
    public static void clickCoreValuesLink(){coreValuesLink.click();}

    //Board of Advisors - click on the link method
    @FindBy(xpath = "//a[@href='http://www.integrativenutrition.com/about-us#advisors']")
    private static WebElement advisorBoardLink;
    public static void clickAdvisorBoardLink(){advisorBoardLink.click();}

    //Reviews - click on the link method
    @FindBy(xpath = ".//*[@id='footer-menu-2']/li[4]/ul/li[4]/a")
    private static WebElement reviewsLink;
    public static void clickReviewsLink(){reviewsLink.click();}

    //Blog - click on the link method
    @FindBy(xpath = "//a[@href='/blog']")
    private static WebElement blogLink;
    public static void clickBlogLink(){blogLink.click();}

    //From the Founder - click on the link method
    @FindBy(xpath = "//a[@href='/blog/categories/notes-from-the-founder']")
    private static WebElement fromFounder;
    public static void clickFromFounderLink(){fromFounder.click();}

    //Health Trends - click on the link method
    @FindBy(xpath = "//a[@href='/blog/categories/health-trends']")
    private static WebElement healthTrends;
    public static void clickHealthTrendsLink(){healthTrends.click();}

    //Regulatory Information - click on the link method
    @FindBy(xpath = "//a[@href='/about/regulatory']")
    private static WebElement regInfoLink;
    public static void clickRegulatoryInfoLink(){regInfoLink.click();}

    //Terms & Privacy Policy - click on the link method
    @FindBy(xpath = "//a[@href='/lp/privacypolicy']")
    private static WebElement termsPrivacyLink;
    public static void clickTermsPrivacyLink(){termsPrivacyLink.click();}

    //Affiliates - click on the link method
    @FindBy(xpath = "//a[@href='/affiliates']")
    private static WebElement affiliatesLink;
    public static void clickAffiliatesLink(){affiliatesLink.click();}

    //Jobs - click on the link method
    @FindBy(xpath = "//a[@href='/jobs']")
    private static WebElement jobsLink;
    public static void clickJobsLink(){jobsLink.click();}


    //*** Connect With Us *****************************************************************************************

    //Facebook - click on the icon method
    @FindBy(xpath = "//span[@class=con-font_facebookcircle")
    private static WebElement faceBookIcon;
    public static void clickFacebookIcon(){faceBookIcon.click();}

    //Twitter - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_twittercircle']")
    private static WebElement twitterIcon;
    public static void clickTwitterIcon(){twitterIcon.click();}

    //Tumbler - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_tumblrcircle']")
    private static WebElement tumblerIcon;
    public static void clickTumblerIcon(){tumblerIcon.click();}

    //Youtube - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_youtubecircle']")
    private static WebElement youtubeIcon;
    public static void clickyouTubeIcon(){youtubeIcon.click();}

    //LinkedIn - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_linkedincircle']")
    private static WebElement linkedInIcon;
    public static void clickLinkedInIcon(){linkedInIcon.click();}

    //Vine - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_vinecircle']")
    private static WebElement vineIcon;
    public static void clickVineIcon(){vineIcon.click();}

    //Google Plus - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_googlecircle']")
    private static WebElement googlePlusIcon;
    public static void clickGPlusIcon(){googlePlusIcon.click();}

    //Amazon - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_amazoncircle']")
    private static WebElement amazonIcon;
    public static void clickAmazonIcon(){amazonIcon.click();}

    //SnapChat - click on the icon method
    @FindBy(xpath = "//i[@class='icon-font_snapchatcircle']")
    private static WebElement snapchatIcon;



}
