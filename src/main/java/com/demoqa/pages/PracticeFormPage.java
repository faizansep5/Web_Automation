package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class PracticeFormPage extends BasePage {
    private final By femaleRadioButton = By.xpath("//input[@value='Female']");

    public void clickFemaleRadioButton() {
        click(femaleRadioButton);
    }

    public boolean IsFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();

    }
}
