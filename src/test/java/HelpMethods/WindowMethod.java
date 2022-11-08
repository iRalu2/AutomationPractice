package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class WindowMethod {
    public WebDriver driver;

    public WindowMethod(WebDriver driver){
        this.driver = driver;
    }

    public void SpecificWindow(Integer index){
        ArrayList<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(index));
        System.out.println("New Title: " + driver.getTitle());
    }

    public void closeWindow(){
        driver.close();
    }
}
