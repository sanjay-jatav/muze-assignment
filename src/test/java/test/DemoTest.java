package test;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import pages.UserProfilePage; 
import org.openqa.selenium.Keys;

public class DemoTest extends BaseTest {

    @Test
    public void loginToApp() throws Exception {
        System.out.println("Application Title: " + driver.getTitle());

        // Home Page logic
        HomePage homePage = new HomePage(driver);
        homePage.clickSignUp();

        // Login logic
        LoginPage loginPage = new LoginPage(driver);
        String userEmail = prop.getProperty("username");
        loginPage.enterEmail(userEmail);
        loginPage.clickContinue();

        System.out.println("OTP requested for: " + userEmail);
        System.out.println("Please enter OTP manually...");
        Thread.sleep(50000); 
        
        homePage.clickSearchInputFieldIcon();
        homePage.enterSearchQuery("test-user" + Keys.ENTER);

        
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickOnUser();

        UserProfilePage profilePage = new UserProfilePage(driver);
        profilePage.followAndMessage("Hello Sanjay, this is an automated message.");
        
        System.out.println("Test Execution Completed Successfully!");
    }
}
