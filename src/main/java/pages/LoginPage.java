package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    private WebDriverWait wait;

    private final By emailField =
            By.xpath("//input[@type='email']");

    private final By continueButton =
            By.xpath("//button[contains(normalize-space(),'Continue with email')]");

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        this.wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(15));
    }

    public void enterEmail(String email) {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(emailField))
                .sendKeys(email);
    }

    public void clickContinue() {

        wait.until(
                ExpectedConditions.elementToBeClickable(continueButton))
                .click();
    }
}