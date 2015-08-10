package testScripts;

import objectRepository.Header;
import org.junit.Test;
import setUpClasses.DriverInitialization;

/**
 * Created by carlos on 8/9/15.
 */
public class LosTestRun extends DriverInitialization {

    @Test
    public void losTest(){
    Header.clickHomeIcon();
    Header.clickCurriculumIcon();
    Header.conductSearch("kale");

}

}
