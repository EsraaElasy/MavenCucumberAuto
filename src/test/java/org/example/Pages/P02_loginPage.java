package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_loginPage {
    public WebElement loginpage()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public WebElement emailLoc(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordLoc(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginBtnLoc(){
        return Hooks.driver.findElement(By.className("login-button"));
    }
}
