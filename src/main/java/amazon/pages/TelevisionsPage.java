package amazon.pages;

public class TelevisionsPage extends PageBase{
    private String televisionPageXpath = "//img[contains(@alt, 'Television Store')]";

    public  TelevisionsPage () throws Exception{
        if (patientlyByXPath(televisionPageXpath) == null) throw new Exception("not on Television page");
        }

    private String searchByBrandXpath = "//span[contains(text(), '%s')]/..//input";

    public ResultsPage chooseBrand (String brandName) throws Exception{
        scrollAndClick(patientlyByXPath(String.format(searchByBrandXpath, brandName)));
        return new ResultsPage();
    }

}
