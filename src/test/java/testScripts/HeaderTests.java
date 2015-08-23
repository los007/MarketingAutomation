package testScripts;


import org.junit.Assert;
import objectRepository.Header;
import org.junit.Test;
import setUpClasses.DriverInitialization;


public class HeaderTests extends DriverInitialization {

    @Test  //Test if phone number is present in header
        public void phonePresence () {
        boolean present = Header.phoneNumber.isDisplayed();
        Assert.assertTrue(present);
        }

    @Test //Contact Us link takes user to Contact Us page
    public void contactUs() {
        Header.clickContactUsIcon();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/contact-us");
        }

}



