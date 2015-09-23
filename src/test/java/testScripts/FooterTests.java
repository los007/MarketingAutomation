package testScripts;

import objectRepository.Footer;
import org.junit.Assert;
import org.junit.Test;
import setUpClasses.DriverInitialization;

import java.util.Iterator;
import java.util.Set;


public class FooterTests extends DriverInitialization {

    //*** This section is to test that all footer links go to their respective pages on click ************************

    @Test //Curriculum link
    public void footerCurric() {
        Footer.clickCurriculumLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //IIN Learning Center link
    public void footerLC() {
        Footer.clickLearningCenterLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum#learningcenter");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Visiting Center link
    public void footerVisitTeach() {
        Footer.clickVisitingTeachersLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum#visitingteachers");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Business Training link
    public void footerBusinessTraining() {
        Footer.clickBusinessTrainingLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/curriculum#businesstraining");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Coaching link
    public void footerHealthCoaching() {
        Footer.clickHealthCoachingLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //What is HC link
    public void footerWhatIsHC() {
        Footer.clickWhatsHCLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching#definehc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Grad Success link
    public void footerGradSuccess() {
        Footer.clickGradSuccessLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching#gradsuccess");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Passionate Career link
    public void footerPassionateCareer() {
        Footer.clickCareerPassionLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/health-coaching#careerpassion");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Info Sessions link
    public void footerInfoSessions() {
        Footer.clickInfoSessionsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Meet The Founder link
    public void footerMeetFounder() {
        Footer.clickMeetFounderLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#founder");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Student Experience link
    public void footerStudentExperience() {
        Footer.clickStudentExperienceLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#studentexperience");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //HC Right For You link
    public void footerHCright4You() {
        Footer.clickHCRightForYouLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#hcrightforyou");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //My Healthy Your Healthy link
    public void footerMyHealthy() {
        Footer.clickMyYourHealthLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-sessions#healthy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //About Us link
    public void footerAboutUs() {
        Footer.clickAboutUsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Revolution link
    public void footerHealthRev() {
        Footer.clickHealthRevLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us#aboutvideo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Core Values link
    public void footerCoreValues() {
        Footer.clickCoreValuesLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us#corevalues");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Board of Advisors link
    public void footerAdvisorBoard() {
        Footer.clickAdvisorBoardLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/about-us#advisors");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Reviews link
    public void footerReviews() {
        Footer.clickReviewsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/reviews");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Blog link
    public void footerBlog() {
        Footer.clickBlogLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/blog");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //From the Founder link
    public void footerFromFounder() {
        Footer.clickFromFounderLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/blog/categories/notes-from-the-founder");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Health Trends link
    public void footerHealthTrends() {
        Footer.clickHealthTrendsLink();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/blog/categories/health-trends");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//*** This section is to test that all social media & sub menu links go to their respective pages on click **********************

    @Test //This test clicks on all social media icons & opens them
    public void footerOpenSocialMedia() {
        Footer.clickFacebookIcon();
        Footer.clickTwitterIcon();
        Footer.clickTumblerIcon();
        Footer.clickyouTubeIcon();
        Footer.clickLinkedInIcon();
        Footer.clickVineIcon();
        Footer.clickGPlusIcon();
        Footer.clickAmazonIcon();

        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> socialMedia = tabs.iterator();
        String home = socialMedia.next();
        String faceBook = socialMedia.next();
        String twitter = socialMedia.next();
        String tumbler = socialMedia.next();
        String youTube = socialMedia.next();
        String linkedIn = socialMedia.next();
        String vine = socialMedia.next();
        String googlePlus = socialMedia.next();
        String amazon = socialMedia.next();

        //Facebook
        driver.switchTo().window(faceBook);
        String currentUrlF = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlF, "https://www.facebook.com/NutritionSchool");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Twitter
        driver.switchTo().window(twitter);
        String currentUrlTwit = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlTwit, "https://twitter.com/NutritionSchool");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Tumbler
        driver.switchTo().window(tumbler);
        String currentUrlTum = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlTum, "http://integrativenutrition.tumblr.com/");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //YouTube
        driver.switchTo().window(youTube);
        String currentUrlYouTube = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlYouTube, "https://www.youtube.com/user/integrativenutrition");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //LinkedIn
        driver.switchTo().window(linkedIn);
        String currentUrlLinked = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlLinked, "http://www.linkedin.com/company/institute-for-integrative-nutrition?trk=NUS_CMPY_TWIT");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Vine
        driver.switchTo().window(vine);
        String currentUrlVine = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlVine, "https://vine.co/u/1194388372626505728?mode=grid");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Google Plus
        driver.switchTo().window(googlePlus);
        String currentUrlGPlus = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlGPlus, "https://plus.google.com/112542079191654541836/posts");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Amazon
        driver.switchTo().window(amazon);
        String currentUrlAmazon = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlAmazon, "http://www.amazon.com/s?marketplaceID=ATVPDKIKX0DER&me=A388GKFOEEICY0&merchant=A388GKFOEEICY0&redirect=true");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Navigate back to the home window
        driver.switchTo().window(home);

        //verify SnapChat icon is displayed
        boolean isPresent = Footer.snapchatIcon.isDisplayed();
        try {
            Assert.assertTrue(isPresent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test //This tests sub footer menu
    public void footerOpenSubFooter() {
        Footer.clickRegulatoryInfoLink();
        Footer.clickTermsPrivacyLink();
        Footer.clickAffiliatesLink();
        Footer.clickJobsLink();

        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> subFooter = tabs.iterator();
        String home = subFooter.next();
        String regInfo = subFooter.next();
        String termsPrivacy = subFooter.next();
        String affiliates = subFooter.next();
        String jobs = subFooter.next();

        //Regulatory Info link
        driver.switchTo().window(regInfo);
        String currentUrlRI = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlRI, "http://www.integrativenutrition.com/about/regulatory");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Terms of Use - Privacy Policy link
        driver.switchTo().window(termsPrivacy);
        String currentUrlTerms = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlTerms, "http://www.integrativenutrition.com/lp/privacypolicy");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Affiliates link
        driver.switchTo().window(affiliates);
        String currentUrlAff = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlAff, "http://www.integrativenutrition.com/affiliates");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Jobs link
        driver.switchTo().window(jobs);
        String currentUrlJobs = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrlJobs, "http://www.integrativenutrition.com/jobs");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Navigate back to the home window
        driver.switchTo().window(home);

    }

}






