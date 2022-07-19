package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/*
Banistmo Automated test for Sustainability page
Created by: ingleandrobarros@outlook.com
 */

public class BanistmoSustainabilityPage extends BasePage {

//    WebDriver driver = BasePage.driver;

    private String SustainabilityGenerationButton = "//*[@id=\"filialTabs\"]/li[3]/a";
    private String textValidation = "//*[@id=\"tab1\"]/div/div/div[1]/h3";
//    private String downloadPDFLink ="";

    public BanistmoSustainabilityPage (){
        super(driver);
    }


    public void clickSustainabilityGeneration(){

        clickElement(SustainabilityGenerationButton);

    }
//TODO
//public void verifyContentInPDf() {
//        //specify the url of the pdf file
//        String url ="http://url.pdf";
//        driver.get(url);
//        try {
//            String pdfContent = readPdfContent(url);
//            Assert.assertTrue(pdfContent.contains("The Pdf995 Suite offers the following features"));
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public void scrollDown(){

        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("window.scrollBy(0,500)");
    }

//    public void clickFileDownloadLink(){
//        clickElement(downloadPDFLink);
//
//    }


    public void matchPDFResult(String matchText){

        String compareText = BasePage.driver.getCurrentUrl();
        System.out.println(compareText);

        Assert.assertEquals(matchText,compareText);


    }

}
