package amazon.pages;

public class HmenuSidebarPage extends PageBase{
    public  HmenuSidebarPage () throws Exception{
        // to do verify on page

    }

    private String tvAndApplianceButtonXpath = "//div[contains(text(), 'TV, Appliances, Electronics')]";
    private String televisionsButtonXpath = "//a[contains(text(), 'Televisions')]";


    public HmenuSidebarPage clickTVAndAppliances() throws Exception {
        patientlyByXPath(tvAndApplianceButtonXpath).click();
        return new HmenuSidebarPage();
    }

    public TelevisionsPage clickTelevision() throws Exception {
        patientlyByXPath(televisionsButtonXpath).click();
        return new TelevisionsPage();
    }

}
