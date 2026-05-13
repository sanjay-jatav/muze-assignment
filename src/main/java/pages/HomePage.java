package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    
    private final By signUpButton = By.xpath("//button[text()='Sign Up']");
    private final By loginButton = By.xpath("//button[text()='Login']");
    private final By searchInputFieldIcon = By.xpath("(//div[@data-slot=\"tooltip-trigger\"])[3]");
    private final By searchInputField = By.xpath("//input[@placeholder=\"Enter your search query here....\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickSignUp() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton)).click();
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
    
    public void clickSearchInputFieldIcon() {
		wait.until(ExpectedConditions.elementToBeClickable(searchInputFieldIcon)).click();
	}
    
    public void enterSearchQuery(String query) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchInputField)).sendKeys(query);
	}
}
