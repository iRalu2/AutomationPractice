package Tests;

import HelpMethods.ElementMethod;
import Pages.IndexPage;
import Pages.RegisterPage;
import SharedData.Hooks;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class RegisterTest extends Hooks {

    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.skipSignIn();

        HashMap<String,String> testData = propertiesFile.getAll();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerProcess(testData);

        /*
        registerPage.fillElement(registerPage.firstName, propertiesFile.getValue("firstNameValue"));
        registerPage.fillElement(registerPage.lastName, propertiesFile.getValue("lastNameValue"));
        registerPage.fillElement(registerPage.address, propertiesFile.getValue("addressValue"));
        registerPage.fillElement(registerPage.emailAddress, propertiesFile.getValue("emailAddressValue"));
        registerPage.fillElement(registerPage.phone, propertiesFile.getValue("phoneValue"));
        registerPage.selectDropDownText(registerPage.skillsSelector, propertiesFile.getValue("skillsValue"));
        registerPage.selectDropDownValue(registerPage.yearSelector, propertiesFile.getValue("yearValue"));
        registerPage.selectDropDownValue(registerPage.monthSelector, propertiesFile.getValue("monthValue"));
        registerPage.selectDropDownValue(registerPage.daySelector, propertiesFile.getValue("dayValue"));
        registerPage.pickLanguage(propertiesFile.getValue("languageSkillValue"));
        registerPage.clickElement(registerPage.genderElement);
        registerPage.clickElement(registerPage.hobbiesElement);
        registerPage.clickElement(registerPage.countryElement);
        registerPage.selectCountryInput(registerPage.countryInput, propertiesFile.getValue("countryValue"));
        registerPage.fillElement(registerPage.fileElement, propertiesFile.getValue("fileElementValue"));
        registerPage.fillElement(registerPage.firstPassword, propertiesFile.getValue("passValue"));
        registerPage.fillElement(registerPage.secondPassword, propertiesFile.getValue("passValue"));
        */

        /*
        ElementMethod elementMethod = new ElementMethod(driver);

        WebElement skipSignIn = driver.findElement(By.id("btn2"));
        //skipSignIn.click();
        elementMethod.ClickElement(skipSignIn);

        WebElement firstName = driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
        String firstNameValue = "Raluca";
        //firstName.sendKeys(firstNameValue);
        elementMethod.FillElement(firstName,firstNameValue);

        WebElement lastName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
        String lastNameValue = "Iovescu";
        elementMethod.FillElement(lastName,lastNameValue);

        WebElement adress = driver.findElement(By.cssSelector(".form-group>div>textarea"));
        elementMethod.FillElement(adress,"Str. Horia, nr.3, Romania");

        WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
        elementMethod.FillElement(email,"riovescu@pentalog.com");

        WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
        elementMethod.FillElement(phone,"1234567890");

        //dropdown-urile

        WebElement skillsSelector = driver.findElement(By.id("Skills"));
        String skillsValue = "Java";
        //Select skillsSelect = new Select(skillsSelector);
        //skillsSelect.selectByVisibleText(skillsValue);
        elementMethod.SelectDropDownText(skillsSelector,skillsValue);

        WebElement yearSelector = driver.findElement(By.id("yearbox"));
        String yearValue = "1992";
        elementMethod.SelectDropDownValue(yearSelector,yearValue);

        WebElement monthSelector = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
        String monthValue = "February";
        elementMethod.SelectDropDownValue(monthSelector,monthValue);

        WebElement daySelector = driver.findElement(By.id("daybox"));
        String dayValue = "18";
        elementMethod.SelectDropDownValue(daySelector,dayValue);

        WebElement languageElement = driver.findElement(By.id("msdd"));
        elementMethod.ClickElement(languageElement);

        List<WebElement> languageElements = driver.findElements(By.cssSelector(".ui-autocomplete>li>a"));
        for (Integer index=0;index<languageElements.size();index++){
            if(languageElements.get(index).getText().equals("English")){
                languageElements.get(index).click();
                break;
            }
        }

        WebElement genderElement = driver.findElement(By.cssSelector("input[value='FeMale']"));
        elementMethod.ClickElement(genderElement);

        WebElement hobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
        elementMethod.ClickElement(hobbies);

        WebElement selectLanguageElement = driver.findElement(By.id("Skills"));
        elementMethod.ClickElement(selectLanguageElement);
        WebElement selectLanguage = driver.findElement(By.id("Skills"));
        elementMethod.FillElement(selectLanguage,"Art Design");
        elementMethod.FillElementKeys(selectLanguage,Keys.ENTER);

        WebElement selectCountryElement = driver.findElement(By.cssSelector(".select2-selection--single"));
        elementMethod.ClickElement(selectCountryElement);

        WebElement selectCountryInput = driver.findElement(By.cssSelector(".select2-search__field"));
        //selectCountryInput.sendKeys("Denmark");
        //selectCountryInput.sendKeys(Keys.ENTER);
        elementMethod.FillElement(selectCountryInput,"Denmark");
        elementMethod.FillElementKeys(selectCountryElement,Keys.ENTER);

        WebElement fileElement = driver.findElement(By.id("imagesrc"));
        //fileElement.sendKeys("src/test/resources/IMG-6626.jpg");
        elementMethod.FillElement(fileElement,"C:/Users/riovescu/IdeaProjects/AutomationPractice/src/test/resources/IMG-6626.jpg");

        WebElement firstPassword = driver.findElement(By.id("firstpassword"));
        elementMethod.FillElement(firstPassword,"ABC123*");

        WebElement secondPassword = driver.findElement(By.id("secondpassword"));
        elementMethod.FillElement(secondPassword,"ABC123*");
        */
    }
}
