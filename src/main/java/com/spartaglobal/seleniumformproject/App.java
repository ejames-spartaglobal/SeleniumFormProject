package com.spartaglobal.seleniumformproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Edward James\\Downloads\\chromedriver_win32\\chromedriver.exe");
        QaFormsPage qaFormsPage = new QaFormsPage();
        qaFormsPage.goToHomePage();
        qaFormsPage.clickCookieButton();
//        qaFormsPage.getSexElements();
//        qaFormsPage.getExpElements();
//        qaFormsPage.getElements(qaFormsPage.experienceElements);
//        qaFormsPage.inputFirstName("Edward");
        qaFormsPage.selectContinents();
    }


}
