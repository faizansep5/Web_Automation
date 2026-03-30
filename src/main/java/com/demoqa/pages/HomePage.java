package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElement;

public class HomePage extends BasePage
{
    private final By formsCard = By.xpath("//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//h5[text()='Elements']");

    public ElementsPage gotoElements(){
        scrollToElement(elementsCard);
        waitForClick(elementsCard,2);
        click(elementsCard);
        return new ElementsPage();
    }

    public FormsPage gotoForms(){
        scrollToElement(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
