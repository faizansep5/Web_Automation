package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class PracticeFormPage extends BasePage {
    private final By femaleRadioButton = By.xpath("//input[@value='Female']");
    private final By sportsCheckbox = By.id("hobbies-checkbox-1");
    private final By readingCheckbox = By.id("hobbies-checkbox-2");
    private final By musicCheckbox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton() {
        click(femaleRadioButton);
    }

    public boolean IsFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();

    }

    public void clickSportsCheckbox() {
        if (!find(sportsCheckbox).isSelected()) {
            click(sportsCheckbox);
        }
    }

    public void clickReadingCheckbox() {
        if (!find(readingCheckbox).isSelected()) {
            click(readingCheckbox);
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicCheckbox).isSelected()) {
            click(musicCheckbox);
        }
    }

    public void unclickReadingCheckbox() {
        if (find(readingCheckbox).isSelected()) {
            click(readingCheckbox);
        }
    }

    public boolean readingCheckboxIsSelected(){
        return find(readingCheckbox).isSelected();
    }
}
