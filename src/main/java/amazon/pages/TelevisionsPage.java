package amazon.pages;

public class TelevisionsPage extends PageBase{
    public  TelevisionsPage () throws Exception{
        // to do verify on page

    }
    private String searchByBrandXpath = "//span[contains(text(), '%s')]/..//input";


    public ResultsPage chooseBrand (String brandName) throws Exception{
        scrollAndClick(patientlyByXPath(String.format(searchByBrandXpath, brandName)));
        return new ResultsPage();
    }

}
