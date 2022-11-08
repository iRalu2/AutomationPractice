package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PageMethod {

    public WebDriver driver;

    public PageMethod(WebDriver driver){
        this.driver = driver;
    }

    public void WaitPageTitle(String value){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleIs(value));
    }

    public void ValidatePageTitle(String value){
        WaitPageTitle(value);
        Assert.assertTrue(driver.getTitle().equals(value));
    }

    public void Navigator(String url){
        driver.navigate().to(url);
    }

}
