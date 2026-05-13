package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.edge.EdgeDriver;       
import io.github.bonigarcia.wdm.WebDriverManager; 

public class DriverFactory {

    public WebDriver driver;

    public WebDriver initDriver(String browser) {
        System.out.println("Initializing driver for browser: " + browser);

        switch (browser.toLowerCase().trim()) {
            case "chrome":
                WebDriverManager.chromedriver().setup(); // Driver setup line
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(); // 'F' capital hoga
                break; // semicolon lagayein
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(); // 'E' capital hoga
                break;
            default:
                System.out.println("Please pass the correct browser: " + browser);
                break;
        }

        
        return driver; 
    }
}
