package amazon;

import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import amazon.pages.HomePage;
import amazon.pages.ResultsPage;
import com.typesafe.config.Config;
import org.openqa.selenium.WebDriver;

public class TestBase {
    public HomePage homePage() throws Exception { return new HomePage(); }
    public ResultsPage resultsPage() throws Exception { return new ResultsPage(); }


    private static Config config = EnvFactory.getInstance().getConfig();
    public static final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    public static WebDriver driver = DriverFactory.getDriver();
}
