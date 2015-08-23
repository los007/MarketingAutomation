package testScripts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.http.HttpResponse;
import setUpClasses.DriverInitialization;

public class HTTPstatus extends DriverInitialization {

    //Test that site is not down
    @Test
        public void SiteStatus() {
        HttpResponse response = new HttpResponse();
        double actualStatus = response.getStatus();
        Assert.assertNotEquals(actualStatus, 500.0);
        }



}
