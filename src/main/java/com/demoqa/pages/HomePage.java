package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElement;

public class HomePage extends BasePage
{
    private By formsCard = By.xpath("//h5[text()='Forms']");

    public FormsPage gotoForms(){
        scrollToElement(formsCard);
        find(formsCard).click();
        return new FormsPage();
    }
}
