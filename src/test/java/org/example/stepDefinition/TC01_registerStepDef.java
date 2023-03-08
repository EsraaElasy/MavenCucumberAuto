package org.example.stepDefinition;

import io.cucumber.java.en.And;
import org.example.Pages.P01_RegisterPage;

public class TC01_registerStepDef {
    P01_RegisterPage register = new P01_RegisterPage();
    @And("go to register page")
    public void register(){
        register.registerpage().click();

    }

}
