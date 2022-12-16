package amazon.pages;

import amazon.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageBase {

    public WebElement patientlyByXPath(final String xpath) {
        return patientlyByXPath(xpath,10);
    }

    public WebElement patientlyByXPath(final String xpath, long timeoutInSeconds) {
        WebElement element;
        try
        {
            element = (new WebDriverWait(TestBase.driver, Duration.ofSeconds(timeoutInSeconds)))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        }
        catch (Exception e)
        {
            return null;
        }
        return element;
    }

    public List<WebElement> byXPath(String xpath) {
        List<WebElement> elements = TestBase.driver.findElements(By.xpath(xpath));
        return elements;
    }

    public void scrollAndClick(WebElement element)
    {
        Actions action = new Actions(TestBase.driver);
        action.moveToElement(element).click().perform();
    }
}
