package pages;

/*
Banistmo Automated test for Sustainability page
Created by: ingleandrobarros@outlook.com
 */

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class BanistmoHomePage extends BasePage {

    private String aboutButton = "//*[@id=\"menu-top\"]/div/ul[1]/li[4]/a";
    private  String prohibitionLink = "//a[@download='ProhibicionesSuperIntendenciaDeBancosSIB']";
//    private  String prohibitionLink = "//*[contains(text(), \"Prohibiciones\")]";


    public BanistmoHomePage (){
        super(driver);
    }

    public void navigateToHome(){

        navigateTo("https://www.banistmo.com/wps/portal/banistmo/personas/");
    }

    public void clickAbout(){

        clickElement(aboutButton);
    }

    public void scrollToFooter(){
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,2000)");
    }

    public void clickProhibitions(){
        clickElement(prohibitionLink);
    }

    public void  isDownload(String filePath, String compareNameFile){

        Assert.assertTrue(isFileDownloaded(filePath, compareNameFile));
    }
}
