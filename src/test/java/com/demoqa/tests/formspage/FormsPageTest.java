package com.demoqa.tests.formspage;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class FormsPageTest extends BaseTest {

    @Test
    public void testPracticeFormPage(){
        var formsPage =  homePage.gotoForms();
        formsPage.clickPracticeForm();
    }

}
