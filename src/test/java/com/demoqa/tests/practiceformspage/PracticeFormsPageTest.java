package com.demoqa.tests.practiceformspage;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormsPageTest extends BaseTest {

    @Test
    void testIsFemaleRadioBtnSelected(){
        var formsPage = homePage.gotoForms();
        var practiceFormPage = formsPage.clickPracticeForm();
        practiceFormPage.clickFemaleRadioButton();
        Assert.assertTrue(practiceFormPage.IsFemaleRadioButtonSelected(), "Female radio button is not selected");
    }

    @Test
    void testIsReadingCheckboxSelected(){
        var formsPage = homePage.gotoForms();
        var practiceFormPage = formsPage.clickPracticeForm();
        practiceFormPage.clickSportsCheckbox();
        practiceFormPage.clickReadingCheckbox();
        practiceFormPage.clickMusicCheckbox();

        practiceFormPage.unclickReadingCheckbox();
        Assert.assertFalse(practiceFormPage.readingCheckboxIsSelected(), "Reading checkbox is selected");

    }
}
