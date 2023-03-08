package org.example.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
 public static WebDriver driver = null;
    //@Given("open chrome browser")
    @Before
    public static void openBrowser()
    {
        //1- Define Bridge
        // System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        // 2- Create new object from chromedriver
        driver = new ChromeDriver();

        // 3- Configuration
        //3.1- Maximize browser
        driver.manage().window().maximize();

        //3.2- Set implicit wait
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    //  @And("quit driver")
    @After
    public static void quit() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

    }
}
