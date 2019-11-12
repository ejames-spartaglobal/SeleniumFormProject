package com.spartaglobal.seleniumformproject;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Unit test for simple App.
 */
public class FormTest
{



    @BeforeClass
    public static void setup(){

    }

//    @Test
//    public void partialAccessIsSuccessful()
//    {
//        chromeDriver.navigate().to(url);
//        WebElement cookieButton=chromeDriver.findElement();
//        cookieButton.click();
//        WebElement firstName =chromeDriver.findElement(By.name("firstname"));
//        WebElement lastName =chromeDriver.findElement(By.id("lastname"));
//
//        WebElement genderButton= chromeDriver.findElement(By.id("sex-0"));
//        genderButton.submit();
//        WebElement expButton= chromeDriver.findElement(By.id("exp-0"));
//        expButton.submit();
//        WebElement date = chromeDriver.findElement(By.id("datepicker"));
//        date.sendKeys("12/11/2019");
//        WebElement profession= chromeDriver.findElement(By.id("profession-1"));
//        profession.click();
//        chromeDriver.navigate().to("http://toolsqa.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx");
//        WebElement tool = chromeDriver.findElement(By.id("tool-1"));
//        tool.click();
//        Select continents = new Select(chromeDriver.findElement(By.id("continents")));
//        continents.selectByValue("EU");
//        Select multiContinents = new Select(chromeDriver.findElement(By.id("continentsmultiple")));
//        multiContinents.selectByIndex(0);
//        multiContinents.selectByIndex(1);
//        Select seleniumCommands = new Select(chromeDriver.findElement(By.id("selenium_commands")));
//        seleniumCommands.selectByValue("Browser Commands");
//    }
//
//    @Test
//    public void fullAccessIsSuccessful()
//    {
//        chromeDriver.navigate().to("http://toolsqa.com/automation-practice-table/");
//    }
//
//    @Test
//    public void accessFirstName(){
//        WebElement firstName =chromeDriver.findElement(By.name("firstname"));
//        firstName.sendKeys("Abcdef");
//    }
//
//    @Test
//    public void accessLastName(){
//        WebElement lastName =chromeDriver.findElement(By.id("lastname"));
//        lastName.sendKeys("Abcdef");
//    }
}
