package amazon.pages;

public class HomePage extends PageBase {
    private String homePageCheckXpath = "//i[contains(@class, 'a-icon a-icon-previous-rounded')]";

    public HomePage() throws Exception {
        if (patientlyByXPath(homePageCheckXpath) == null) throw new Exception("not on home page");
    }
    private String hmenuButtonXpath = "//i[contains(@class, 'hm-icon nav-sprite')]";


    public HmenuSidebarPage clickHMenuButton() throws Exception {
        patientlyByXPath(hmenuButtonXpath).click();
        return new HmenuSidebarPage();
    }
}
