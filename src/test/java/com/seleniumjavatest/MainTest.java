package com.seleniumjavatest;

//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    WebDriver driver;

    @BeforeEach

    public void setup(){

        driver = new ChromeDriver();
        driver.get("http://uitestingplayground.com/textinput");
        driver.manage().window().maximize();

    }

    @RepeatedTest(1)

    public void TestWeb() throws InterruptedException {

        WebElement inputElement = driver.findElement(By.xpath("//input[@class='form-control' and @id='newButtonName']"));
        inputElement.sendKeys("texto");

        Thread.sleep(1000);

        WebElement buttonElement = driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='updatingButton']"));
        buttonElement.click();

    }

    @AfterEach

    public void tearDown(){

        driver.close();

    }

}
