package com.spartaglobal.seleniumformproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class QaFormsPage {


    private static String url = "https://www.toolsqa.com/automation-practice-form/";
    private static ChromeDriver chromeDriver = new ChromeDriver();
    private By privateLinkTest = By.linkText("Partial Link Test");
    private By cookieButton = By.id("cookie_action_close_header");
    private By linkTest= By.linkText("Link Test");
    private By firstName= By.name("firstname");
    private By lastName = By.id("lastname");
    private By sexElements = By.name("sex");
    By experienceElements = By.name("exp");
    By profElements = By.name("profession");
    private By date = By.id("datepicker");
    private By toolElements = By.name("tool");
    private By continent = By.id("continents");
    private WebDriver driver;



    public void goToHomePage(){
        chromeDriver.navigate().to(url);
    }
    public void clickCookieButton(){
        chromeDriver.findElement(cookieButton).click();
    }
    public void clickLinkTest(){
        chromeDriver.findElement(linkTest).click();
    }
    public void inputFirstName(String firstNameText){
        chromeDriver.findElement(firstName).sendKeys(firstNameText);
    }
    public void inputLastName(String lastNameText){
        chromeDriver.findElement(lastName).sendKeys(lastNameText);
    }

    public void inputDate(String dateText){
        chromeDriver.findElement(date).sendKeys(dateText);
    }


    public void getSexElements(){
        List<WebElement> sexItems=chromeDriver.findElements(sexElements);

        for (org.openqa.selenium.WebElement sexItem:sexItems) {
            chromeDriver.findElement(By.id(sexItem.getAttribute("id"))).click();
            chromeDriver.findElement(By.id(sexItem.getAttribute("id"))).isSelected();
            System.out.println(sexItem.getAttribute("id"));
        }
    }

    public void getElements(By element){
        List<WebElement> items = chromeDriver.findElements(element);
        for (org.openqa.selenium.WebElement item: items){
            chromeDriver.findElement(By.id(item.getAttribute("id"))).click();
            chromeDriver.findElement(By.id(item.getAttribute("id"))).isSelected();
            System.out.println(item.getAttribute("id"));
        }
    }

    public void selectContinents(){
        Select selectContinents = new Select(chromeDriver.findElement(continent));
        for (WebElement item: selectContinents.getOptions()) {
            selectContinents.selectByValue(item.getAttribute("value"));
            System.out.println(selectContinents.getAllSelectedOptions());
        }
    }
}
