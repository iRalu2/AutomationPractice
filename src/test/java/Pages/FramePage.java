package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-tabs a")
    public List<WebElement> buttonList;

    @FindBy(css = "input[type='text']")
    public WebElement inputElement;

    public void singleFrame(String message){
        buttonList.get(0).click();
        frameMethod.SwitchFrame("singleframe");
        inputElement.sendKeys(message);
        frameMethod.SwitchToDefault();
    }

    public void multipleFrame(String message){
        buttonList.get(1).click();
        frameMethod.SwitchFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethod.SwitchFrame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        inputElement.sendKeys(message);
    }
}
