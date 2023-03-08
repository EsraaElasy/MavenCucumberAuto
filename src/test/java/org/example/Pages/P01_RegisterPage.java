package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_RegisterPage {

public WebElement registerpage(){
    return Hooks.driver.findElement(By.className("ico-register"));
}
}
