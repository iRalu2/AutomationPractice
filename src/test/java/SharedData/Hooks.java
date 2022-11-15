package SharedData;

import inputFile.PropertiesFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{

    public PropertiesFile propertiesFile;

    @BeforeMethod
    public void prepareEnvironment(){
        prepaireDriver();
        propertiesFile = new PropertiesFile();
    }

    @AfterMethod
    public void clearEnvironment(){
        closeDriver();
    }

}
