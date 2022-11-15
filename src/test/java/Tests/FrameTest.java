package Tests;

import HelpMethods.ElementMethod;
import HelpMethods.FrameMethod;
import HelpMethods.PageMethod;
import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class FrameTest extends Hooks {

    @Test
    public void MetodaTest(){

        IndexPage indexPage = new IndexPage(driver);
        indexPage.skipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToFrames();

        FramePage framePage = new FramePage(driver);
        framePage.singleFrame(propertiesFile.getValue("singleFrameTestValue"));
        framePage.multipleFrame(propertiesFile.getValue("multipleFrameTestValue"));

        /*
        ElementMethod elementMethod = new ElementMethod(driver);
        PageMethod pageMethod = new PageMethod(driver);
        FrameMethod frameMethod = new FrameMethod(driver);

        WebElement skipSignIn = driver.findElement(By.id("btn2"));
        elementMethod.ClickElement(skipSignIn);

        WebElement switchToElement = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMethod.MoveToElement(switchToElement);

        WebElement framesElement = driver.findElement(By.xpath("//a[text()='Frames']"));
        elementMethod.ClickElement(framesElement);

        pageMethod.Navigator("https://demo.automationtesting.in/Frames.html");

        List<WebElement> buttonList = driver.findElements(By.cssSelector(".nav-tabs a"));
        buttonList.get(0).click();

        frameMethod.SwitchFrame("singleframe"); //driver.switchTo().frame("singleframe");
        WebElement inputElement = driver.findElement(By.cssSelector("input[type='text']"));
        inputElement.sendKeys("Ana are mere."); //inputElement.sendKeys("Ana are mere.");

        //switch back to the entire page
        //driver.switchTo().defaultContent();
        frameMethod.SwitchToDefault();

        buttonList.get(1).click();

        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrames.html']")));
        frameMethod.SwitchFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethod.SwitchFrame(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));

        WebElement inputElement2 = driver.findElement(By.cssSelector("input[type='text']"));
        inputElement2.sendKeys("Ion are pere.");

        //switch back to the first iFrame
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        //frameMethod.SwitchFrame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        */
    }
}
