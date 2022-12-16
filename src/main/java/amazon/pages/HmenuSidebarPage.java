package amazon.pages;

public class HmenuSidebarPage extends PageBase{

    private String hMenuSidebarPageXpath = "//ul[contains(@class, 'hmenu hmenu-visible')]";

    public  HmenuSidebarPage () throws Exception{
        if (patientlyByXPath(hMenuSidebarPageXpath) == null) throw new Exception("not on SideBarPage page");
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
