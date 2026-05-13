package base;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {
    
    protected WebDriver driver;
    protected Properties prop;
    ConfigReader configReader;
    DriverFactory df;

    @BeforeMethod
    public void setup() {
    
        configReader = new ConfigReader();
        prop = configReader.initProperties();
        
        
        String browserName = prop.getProperty("browser");
        df = new DriverFactory();
        driver = df.initDriver(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
