package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UserProfilePage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By actionButton = By.cssSelector("div.relative > div.absolute > button.transition-colors");
    private By chatTextArea = By.cssSelector("textarea[placeholder='Write your message here...']");

    public UserProfilePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void followAndMessage(String message) throws InterruptedException {
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(actionButton));
        String btnText = btn.getText();

        if (btnText.equalsIgnoreCase("Follow")) {
            System.out.println("Status: Not following. Clicking Follow...");
            btn.click();
            // Follow ke baad button text 'Message' hone ka wait karein
            wait.until(ExpectedConditions.textToBePresentInElementLocated(actionButton, "Message"));
        }

        System.out.println("Clicking on Message button...");
        driver.findElement(actionButton).click();

        // Chat open hone ke liye thoda wait
        Thread.sleep(3000); 

        System.out.println("Sending message: " + message);
        WebElement msgBox = wait.until(ExpectedConditions.visibilityOfElementLocated(chatTextArea));
        msgBox.sendKeys(message + org.openqa.selenium.Keys.ENTER);
    }
}
