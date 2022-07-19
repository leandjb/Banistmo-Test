package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    private final WebDriverWait wait;

    static {

        //Set webdriver properties

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();


    }

    public BasePage(WebDriver driver) {

        //implicity waits
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));

    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.quit();
    }

    private WebElement findSomething(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {

        findSomething(locator).click();
    }

    public boolean isFileDownloaded(String fileDownloadpath, String fileName) {

        boolean flag = false;

        File directory = new File(fileDownloadpath);

        File[] content = directory.listFiles();

        for (int i = 0; i < content.length; i++) {
            if (content[i].getName().equals(fileName))
                return flag = true;
        }
        return flag;
    }
}
