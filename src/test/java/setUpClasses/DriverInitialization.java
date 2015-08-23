package setUpClasses;

import objectRepository.Header;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverInitialization  {

    public static WebDriver driver;

    @BeforeClass
    public static void createEnvironment() {
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("http://www.integrativenutrition.com/curriculum");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        PageFactory.initElements(driver, new Header());}

    @AfterClass
    public static void tearDownEnvironment(){
        driver.quit();
        }

    }

