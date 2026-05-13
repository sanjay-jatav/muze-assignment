package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locator
    private By userResult = By.xpath("//span[text()='test-user']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnUser() {
        // Element ke visible hone ka wait karein phir click karein
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(userResult));
        element.click();
    }
}
