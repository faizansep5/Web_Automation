package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class FormsPage extends BasePage {
    private final By practiceFormMenuItem = By.xpath("//span[text()='Practice Form']/parent::a/parent::li");

    public PracticeFormPage clickPracticeForm(){
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
