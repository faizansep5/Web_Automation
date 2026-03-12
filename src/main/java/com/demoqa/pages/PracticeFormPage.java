package com.demoqa.pages;

import org.openqa.selenium.By;

public class PracticeFormPage extends FormsPage{
    private final By femaleRadioButton = By.xpath("//input[@value='Female']");

    public boolean selectFemaleRadioButton(){
        click(femaleRadioButton);
        return find(femaleRadioButton).isSelected();

    }
}
