package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[ng-model='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    public WebElement lastName;

    @FindBy(css = ".form-group>div>textarea")
    public WebElement address;

    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@ng-model='Phone']")
    public WebElement phone;

    @FindBy(id = "Skills")
    public WebElement skillsSelector;

    @FindBy(id = "yearbox")
    public WebElement yearSelector;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    public WebElement monthSelector;

    @FindBy(id = "daybox")
    public WebElement daySelector;

    @FindBy(id = "msdd")
    public WebElement languageElement;

    @FindBy(css = ".ui-autocomplete>li>a")
    public List<WebElement> languageElements;

    @FindBy(css = "input[value='FeMale']")
    public WebElement genderElement;

    @FindBy(xpath = "//input[@value='Movies']")
    public WebElement hobbiesElement;

    @FindBy(id = "Skills")
    public WebElement selectLanguageElement;

    @FindBy(id = "Skills")
    public WebElement selectLanguage;

    @FindBy(css = ".select2-selection--single")
    public WebElement countryElement;

    @FindBy(css = ".select2-search__field")
    public WebElement countryInput;

    @FindBy(id = "imagesrc")
    public WebElement fileElement;

    @FindBy(id = "firstpassword")
    public WebElement firstPassword;

    @FindBy(id = "secondpassword")
    public WebElement secondPassword;

    @FindBy(xpath = "//a[text()='SwitchTo']")
    public WebElement switchToElement;

    @FindBy(xpath = "//a[text()='Alerts']")
    public WebElement alertsElement;

    @FindBy(xpath = "//a[text()='Frames']")
    public WebElement framesElement;

    @FindBy(xpath = "//a[text()='Windows']")
    public WebElement windowsElement;

    public void goToAlert(){
        Actions actiuni = new Actions(driver);
        actiuni.moveToElement(switchToElement).perform();
        actiuni.moveToElement(alertsElement).perform();
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
    }

    public void goToFrames(){
        elementMethod.MoveToElement(switchToElement);
        elementMethod.ClickElement(framesElement);
        pageMethod.Navigator("https://demo.automationtesting.in/Frames.html");
    }

    public void goToWindows(){
        elementMethod.MoveToElement(switchToElement);
        elementMethod.ClickElement(windowsElement);
        pageMethod.Navigator("https://demo.automationtesting.in/Windows.html");
    }

    public void registerProcess(HashMap<String,String> testData){
        elementMethod.FillElement(firstName,testData.get("firstNameValue"));
        elementMethod.FillElement(lastName,testData.get("lastNameValue"));
        elementMethod.FillElement(address,testData.get("addressValue"));
        elementMethod.FillElement(emailAddress,testData.get("emailAddressValue"));
        elementMethod.FillElement(phone,testData.get("phoneValue"));
        elementMethod.SelectDropDownText(skillsSelector,testData.get("skillsValue"));
        elementMethod.SelectDropDownValue(yearSelector,testData.get("yearValue"));
        elementMethod.SelectDropDownValue(monthSelector,testData.get("monthValue"));
        elementMethod.SelectDropDownValue(daySelector,testData.get("dayValue"));
        elementMethod.ClickElement(languageElement);
        for (WebElement webElement : languageElements){
            if(webElement.getText().equals(testData.get("languageValue"))){
                webElement.click();
                break;
            }
        }
        elementMethod.ClickElement(genderElement);
        elementMethod.ClickElement(hobbiesElement);
        elementMethod.ClickElement(selectLanguageElement);
        elementMethod.FillElement(selectLanguage,testData.get("languageSkillValue"));
        elementMethod.FillElementKeys(selectLanguage,Keys.ENTER);
        elementMethod.ClickElement(countryElement);
        elementMethod.FillElement(countryInput,testData.get("countryValue"));
        elementMethod.FillElementKeys(countryElement,Keys.ENTER);
        elementMethod.FillElement(fileElement,testData.get("fileElementValue"));
        elementMethod.FillElement(firstPassword,testData.get("passValue"));
        elementMethod.FillElement(secondPassword,testData.get("passValue"));
    }

/*
    public void fillElement(WebElement element, String value){
        elementMethod.FillElement(element,value);
    }

    public void selectDropDownText(WebElement element, String text){
        elementMethod.SelectDropDownText(element,text);
    }

    public void selectDropDownValue(WebElement element, String value){
        elementMethod.SelectDropDownValue(element,value);
    }

    public void clickElement(WebElement element){
        elementMethod.ClickElement(element);
    }

    public void pickLanguage(String language){
        elementMethod.ClickElement(languageElement);
        for (Integer index=0;index<languageElements.size();index++){
            if(languageElements.get(index).getText().equals(language)){
                languageElements.get(index).click();
                break;
            }
        }
    }

    public void selectCountryInput(WebElement element, String input){
        elementMethod.FillElement(element,input);
        elementMethod.FillElementKeys(element, Keys.ENTER);

    }
*/
}

