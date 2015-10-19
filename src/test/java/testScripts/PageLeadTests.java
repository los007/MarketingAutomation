package testScripts;
import objectRepository.Forms;
import objectRepository.PaidLeadGen;
import org.junit.Assert;
import org.junit.Test;
import setUpClasses.DriverInitialization;

public class PageLeadTests extends DriverInitialization {

//*** These tests are for the Paid Lead Gen pages

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation
     **************************************************************/

    @Test //Tests if banner is displayed
    public void bannerDisplayed() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests form won't submit if name field is blank
    public void nameValidation() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.inputEmail("paidLeadTest@qatest.edu");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidation() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    @Test //Tests that flags match country code using FIji
    public void countryFlagMatch() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.selectFlag();
        WebElement fiji = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[76]/span[1]"));
        fiji.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
     */

    /*
        public void showThings(subbed){

        return subbed;
    };
        String returnedPhone = return Forms.formPhone.getText();
        showMessageDialog(null,returnedPhone);
        System.out.println(returnedPhone);
        int rawPhone = Integer.parseInt(returnedPhone);
        System.out.println(rawPhone);

      //  boolean countryCode = rawPhone.contains(679);

        try {
            Assert.assertTrue(countryCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    @Test //Tests that form submits properly
    public void formSubmit() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.inputName("qaTest");
        Forms.inputEmail("qatesting@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/class-thank-you?sid=");
        try {
            Assert.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-r
     **************************************************************/

    @Test //Tests if banner is displayed
    public void bannerDisplayedR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests form won't submit if name field is blank
    public void nameValidationR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        Forms.inputEmail("paidLeadTest@qatest.edu");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation-r");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidationR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation-r");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    @Test //Tests that flags match country code using FIji
    public void countryFlagMatchR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        Forms.selectFlag();
        WebElement fiji = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[76]/span[1]"));
        fiji.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
     */

    /*
        public void showThings(subbed){

        return subbed;
    };
        String returnedPhone = return Forms.formPhone.getText();
        showMessageDialog(null,returnedPhone);
        System.out.println(returnedPhone);
        int rawPhone = Integer.parseInt(returnedPhone);
        System.out.println(rawPhone);

      //  boolean countryCode = rawPhone.contains(679);

        try {
            Assert.assertTrue(countryCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    @Test //Tests that form submits properly
    public void formSubmitR() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-r");
        Forms.inputName("qaTest");
        Forms.inputEmail("qatesting@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/class-thank-you?sid=");
        try {
            Assert.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**************************************************************
     * http://www.integrativenutrition.com/info-nutritioneducation-d
     **************************************************************/

    @Test //Tests if banner is displayed
    public void bannerDisplayedD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        boolean bannerAppear = PaidLeadGen.headerBanner.isDisplayed();
        try {
            Assert.assertTrue(bannerAppear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests form won't submit if name field is blank
    public void nameValidationD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        Forms.inputEmail("paidLeadTest@qatest.edu");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation-d");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test //Tests that form won't submit if email field is blank
    public void emailValidationD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        Forms.inputName("qaTest");
        Forms.clickSubmitButton();
        String currentUrl = driver.getCurrentUrl();
        try {
            Assert.assertEquals(currentUrl, "http://www.integrativenutrition.com/info-nutritioneducation-d");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    @Test //Tests that flags match country code using FIji
    public void countryFlagMatch() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation");
        Forms.selectFlag();
        WebElement fiji = driver.findElement(By.xpath(".//*[@id='webform-component-Home-Phone--c']/div[1]/div/ul/li[76]/span[1]"));
        fiji.click();
        Forms.enterPhoneNumber("1111111111");
        Forms.clickSubmitButton();
     */

    /*
        public void showThings(subbed){

        return subbed;
    };
        String returnedPhone = return Forms.formPhone.getText();
        showMessageDialog(null,returnedPhone);
        System.out.println(returnedPhone);
        int rawPhone = Integer.parseInt(returnedPhone);
        System.out.println(rawPhone);

      //  boolean countryCode = rawPhone.contains(679);

        try {
            Assert.assertTrue(countryCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    @Test //Tests that form submits properly
    public void formSubmitD() {
        driver.get("http://www.integrativenutrition.com/info-nutritioneducation-d");
        Forms.inputName("qaTest");
        Forms.inputEmail("qatesting@qatest.edu");
        Forms.clickSubmitButton();
        boolean expectedUrl= driver.getCurrentUrl().contains("http://www.integrativenutrition.com/class-thank-you?sid=");
        try {
            Assert.assertTrue(expectedUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }





