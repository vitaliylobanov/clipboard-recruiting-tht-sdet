import amazon.TestBase;
import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import amazon.pages.HomePage;
import com.typesafe.config.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

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

    @Test
    void test() throws Exception {
        driver.get(HOME_PAGE_URL);
        homePage()
                .clickHMenuButton()
                .clickTVAndAppliances()
                .clickTelevision()
                .chooseBrand("Samsung");
        assertEquals("Amazon.com. Spend less. Smile more.", driver.getTitle());
    }
}
