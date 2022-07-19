package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BanistmoAboutPage;
import pages.BanistmoHomePage;
import pages.BanistmoSustainabilityPage;

/*
Banistmo Automated test for Sustainability page
Created by: ingleandrobarros@outlook.com
 */

public class SustainabilitySteps {


    BanistmoHomePage banistmoHome = new BanistmoHomePage();
    BanistmoAboutPage banistmoAbout = new BanistmoAboutPage();
    BanistmoSustainabilityPage banistmoSustainability = new BanistmoSustainabilityPage();


    @Given("i am Banistmo home page")
    public void iAmBanistmoHomePage() {
        banistmoHome.navigateToHome();
    }

    @And("click on about section")
    public void clickOnAboutSection() {
        banistmoHome.clickAbout();
    }

    @And("click Sustainability link")
    public void clickSustainabilityLink() {
        banistmoAbout.clickCorporate();
        banistmoAbout.clickSustainability();

    }

    @When("i search Sustainability generation link")
    public void iSearchSustainabilityGenerationLink() {
        //TODO
        //Currently de page can not find GenerationLink locator (don't exist)
//        System.out.println("NO SE PUEDE ENCONTRAR ESTE LOCALIZADOR, SE EJECUTA ALTERNTIVA");

        banistmoSustainability.clickSustainabilityGeneration();
    }

    @Then("the results match with Sustainability generation file")
    public void theResultsMatchWithSustainabilityGenerationFile() {
        //TODO
        //Currently de page can not download PDF file
//        System.out.println("NO SE PUEDE DESCARGAR EL PDF DESDE LA PAGINA");

//        banistmoSustainability.verifyContentInPDf();

        banistmoSustainability.scrollDown();

//        banistmoSustainability.clickFileDownloadLink();

        banistmoSustainability.matchPDFResult("https://www.banistmo.com/wps/portal/banistmo/acerca-de/informacion-corporativa/sostenibilidad/");

        banistmoSustainability.closeBrowser();
    }
}
