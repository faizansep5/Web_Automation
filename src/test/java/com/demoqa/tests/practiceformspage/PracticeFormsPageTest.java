package com.demoqa.tests.practiceformspage;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormsPageTest extends BaseTest {

    @Test
    void testIsFemaleRadioBtnSelected(){
        var formsPage = homePage.gotoForms();
        var practiceFormPage = formsPage.clickPracticeForm();
        Assert.assertTrue(practiceFormPage.selectFemaleRadioButton(), "Female radio button is not selected");
    }
}
