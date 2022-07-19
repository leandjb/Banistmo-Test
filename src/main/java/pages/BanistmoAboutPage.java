package pages;

/*
Banistmo Automated test for Sustainability page
Created by: ingleandrobarros@outlook.com
 */

public class BanistmoAboutPage extends BasePage {

    private String corporateInformationButton = "//a[contains(@class, \"dropdown-toggle\")]";
    private String SustainabilityButton = "//div[contains(@class, \"submenu\")]/ul[3]/li[1]/a";

    public BanistmoAboutPage() {

        super(driver);
    }


    public void clickCorporate() {

        clickElement(corporateInformationButton);
    }

    public void clickSustainability() {

        clickElement(SustainabilityButton);
    }
}
