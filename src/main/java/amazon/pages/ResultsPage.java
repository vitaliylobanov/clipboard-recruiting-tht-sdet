package amazon.pages;

public class ResultsPage extends PageBase{
    private String resultsPageCheckXpath = "//span[contains(text(), 'RESULTS')]";

    public  ResultsPage () throws Exception{
        if (patientlyByXPath(resultsPageCheckXpath) == null) throw new Exception("not on Results page");

    }
    public String Featured = "Featured";
    public String PriceLowToHigh = "Price: Low to High";
    public String PriceHighToLow = "Price: High to Low";
    public String AvgCustomerReview = "Avg. Customer Review";
    public String NewestArrivals = "Newest Arrivals";

    private String sortDropDownXpath = "//span[contains(@class, 'dropdown')]//span[contains(@class, 'a-button-inner')]";
    private String chooseSortOptionXpath = "//ul[contains(@role, 'listbox')]//a[contains(text(), '%s')]/..";
    private String chooseResultByPositionXpath = "//div[@data-index= '%s']";


    public ResultsPage openSortDropdown() throws Exception {
        patientlyByXPath(sortDropDownXpath).click();
        return new ResultsPage();
    }

    public ResultsPage choseSortOption(String sortType) throws Exception {
        scrollAndClick(patientlyByXPath(String.format(chooseSortOptionXpath, sortType)));
        return new ResultsPage();
    }

    public void chooseItemFromSearchList(String itemNumber) {
        scrollAndClick(patientlyByXPath(String.format(chooseResultByPositionXpath, itemNumber)));
    }

}
