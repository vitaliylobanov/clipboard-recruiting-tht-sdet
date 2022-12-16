import amazon.TestBase;
import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import amazon.pages.HomePage;
import amazon.pages.ResultsPage;
import com.typesafe.config.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSandbox extends TestBase {

    @Tag("smokeTest")
    @DisplayName("This test is for demo purpose only to show that the basic code works." +
            "You have to use the best practices that you normally use to design your tests")
    @Test
    void assertThatHomePageTitleIsCorrect() {
        driver.get(HOME_PAGE_URL);
        assertEquals("Amazon.com. Spend less. Smile more.", driver.getTitle());
    }

    @DisplayName("This test covering home exercise for amazon.in page")
    @Test
    void amazonTest() throws Exception {
        driver.get(HOME_PAGE_URL);
        homePage()
                .clickHMenuButton()
                .clickTVAndAppliances()
                .clickTelevision()
                .chooseBrand("Samsung")
                .openSortDropdown()
                .choseSortOption(resultsPage().PriceHighToLow)
                .chooseItemFromSearchList("2");
        ArrayList<String> tabs = getNumberOfTabs();
        switchTab(tabs.get(1));
        //please note asserting that we see about item text is happening on Product page class line 12.
        logger.info("About this item: " + productPage().getInfoAboutTheItem());
    }
}
