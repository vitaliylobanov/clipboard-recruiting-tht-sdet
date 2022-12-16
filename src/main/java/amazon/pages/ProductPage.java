package amazon.pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends PageBase {
    private String aboutItemXpath = "//h1[contains(text(), ' About this item ')]";

    public  ProductPage () throws Exception{
        if (patientlyByXPath(aboutItemXpath) == null) throw new Exception("not on Results page");
    }

    private String infoAboutItemXpath = "//ul[contains(@class, 'a-unordered-list a-vertical a-spacing-mini')]//li";


    public ArrayList<String> getInfoAboutTheItem(){
        ArrayList<String> infoAboutItem = new ArrayList<>();
        List<WebElement> about = byXPath(infoAboutItemXpath);
        for (WebElement aboutItem : about) {
            infoAboutItem.add(aboutItem.getText());
        }
        return infoAboutItem;
    }
}
