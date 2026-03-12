package com.demoqa.pages;

import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage{
    private final By femaleRadioButton = By.id("//input[@value='Female']");

    public void selectFemaleRadioButton(){
        click(femaleRadioButton);
    }
}
