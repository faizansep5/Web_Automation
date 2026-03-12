package com.demoqa.tests.homepage;


import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {

    @Test
    public void testScrollingToElement(){
        homePage.gotoForms();
    }
}
