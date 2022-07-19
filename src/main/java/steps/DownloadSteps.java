package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BanistmoHomePage;

public class DownloadSteps {

    BanistmoHomePage banistmoHome = new BanistmoHomePage();
    @Given("is on Banistmo home page")
    public void isOnBanistmoHomePage() {
        banistmoHome.navigateToHome();

    }

    @When("click on prohibitions link")
    public void clickOnProhibitionsLink() {
        banistmoHome.scrollToFooter();
        banistmoHome.clickProhibitions();
    }

    @Then("the PDF file is download")
    public void thePDFFileIsDownload() {

        banistmoHome.isDownload("C:\\Users\\ROG\\Downloads", "ProhibicionesSuperIntendenciaDeBancosSIB.pdf");

    }
}
