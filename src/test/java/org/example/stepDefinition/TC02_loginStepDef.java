package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TC02_loginStepDef {

    P02_loginPage login = new P02_loginPage();

    @And("navigate to home page")
    public void home()
    {
     Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @When("go to login page")
    public void login()
    {
      login.loginpage().click();
    }
    @When("enter valid email and password")
    public void enter() throws InterruptedException {
     login.emailLoc().sendKeys("joperit81@chnlog.com");
     Thread.sleep(2000);
     login.passwordLoc().sendKeys("123456");
    }

    @And("click on login button")
    public void loginbtn() throws InterruptedException {
         login.loginBtnLoc().click();
       //  Thread.sleep(2000);
      // WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
    //  wait.until(ExpectedConditions.elementToBeClickable(login.loginBtnLoc()));

    //    WebDriverWait waiting = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
     //   waiting.until(ExpectedConditions.invisibilityOf(wishlist));
    }
    @Then("verify user login successfully")
    public void verify()
    {
        SoftAssert soft = new SoftAssert();
        WebElement myaccount = Hooks.driver.findElement(By.className("ico-account"));
        soft.assertTrue(myaccount.isDisplayed());
        soft.assertAll();

    }
    // scenario 2
     @When("enter invalid email and password")
    public void invalid(){
         login.emailLoc().sendKeys("asmaa@test.com");
         login.passwordLoc().sendKeys("12345");
     }

     @Then("verify user not login successfully")
    public void notlogedin(){
        SoftAssert soft = new SoftAssert();
       String errormsg =  Hooks.driver.findElement(By.className("message-error")).getText();
       soft.assertTrue(errormsg.contains("Login was unsuccessful."));
       soft.assertAll();
     }





}
