package amazon;

import amazon.factories.DriverFactory;
import amazon.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class TestBase {
    public HomePage homePage() throws Exception { return new HomePage(); }
    public static WebDriver driver = DriverFactory.getDriver();
}
