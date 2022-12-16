package amazon;

import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import amazon.pages.HomePage;
import amazon.pages.ProductPage;
import amazon.pages.ResultsPage;
import com.typesafe.config.Config;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class TestBase {
    private static Config config = EnvFactory.getInstance().getConfig();
    public static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    public static WebDriver driver = DriverFactory.getDriver();

    public Logger logger = Logger.getLogger(TestBase.class);
    public HomePage homePage() throws Exception { return new HomePage(); }
    public ResultsPage resultsPage() throws Exception { return new ResultsPage(); }
    public ProductPage productPage() throws Exception { return new ProductPage(); }



    public ArrayList<String> getNumberOfTabs(){
        return new ArrayList<String> (driver.getWindowHandles());
    }
    public void switchTab (String page) {
        driver.switchTo().window(page);
    }
}
