package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage{
    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    public List<WebElement> windowOptions;

    @FindBy(css = "#Tabbed button")
    public WebElement clickSeleniumWeb;

    @FindBy(css = "#Seperate button")
    public WebElement clickSeleniumNewWindow;

    @FindBy(css = "#Multiple button")
    public WebElement clickSeleniumTwoWindows;

    public void singleTab(){
        windowOptions.get(0).click();
        clickSeleniumWeb.click();
        windowMethod.SpecificWindow(1);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(0);
    }

    public void windowTab(){
        windowOptions.get(1).click();
        clickSeleniumNewWindow.click();
        windowMethod.SpecificWindow(1);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(0);
    }

    public void multipleTab(){
        windowOptions.get(2).click();
        clickSeleniumTwoWindows.click();
        windowMethod.SpecificWindow(2);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(1);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(0);
    }

}
