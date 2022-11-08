package Tests;

import HelpMethods.ElementMethod;
import HelpMethods.PageMethod;
import HelpMethods.WindowMethod;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowsTest extends SharedData {

    @Test
    public void metodaTest() {

        ElementMethod elementHelper = new ElementMethod(driver);
        PageMethod pageHelper = new PageMethod(driver);
        WindowMethod windowMethod = new WindowMethod(driver);

        WebElement skipSignIn = driver.findElement(By.id("btn2"));
        elementHelper.ClickElement(skipSignIn);

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        //Actions actiuni = new Actions(driver);
        //actiuni.moveToElement(switchToElement).perform();
        elementHelper.MoveToElement(switchToElement);

        WebElement windowsElement = driver.findElement(By.xpath("//a[text()='Windows']"));
        elementHelper.MoveToElement(windowsElement);

        //driver.navigate().to("https://demo.automationtesting.in/Windows.html");
        pageHelper.Navigator("https://demo.automationtesting.in/Windows.html");

        List<WebElement> windowOptions = driver.findElements(By.cssSelector(".nav-stacked>li>a"));
        windowOptions.get(0).click();

        WebElement clickSeleniumWeb = driver.findElement(By.cssSelector("#Tabbed button"));
        clickSeleniumWeb.click();

        //System.out.println(driver.getTitle());
        //ArrayList<String> tabList = new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(tabList.get(1));
        //System.out.println(driver.getTitle());
        //driver.close();
        //driver.switchTo().window(tabList.get(0));
        windowMethod.SpecificWindow(1);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(0);

        windowOptions.get(1).click();

        WebElement clickSeleniumNewWindow = driver.findElement(By.cssSelector("#Seperate button"));
        clickSeleniumNewWindow.click();

        windowMethod.SpecificWindow(1);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(0);

        windowOptions.get(2).click();

        WebElement clickSeleniumTwoWindows = driver.findElement(By.cssSelector("#Multiple button"));
        clickSeleniumTwoWindows.click();

        windowMethod.SpecificWindow(2);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(1);
        windowMethod.closeWindow();
        windowMethod.SpecificWindow(0);

    }

}
