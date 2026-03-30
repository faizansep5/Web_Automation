package com.demoqa.tests.elementspage;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTest extends BaseTest {
    @Test
    public void testWebTable(){
        var webTablesPage = homePage.gotoElements().clickWebTables();
        String email = "alden@example.com";
        webTablesPage.clickEdit(email);
        webTablesPage.setAge("34");
        webTablesPage.clickSubmitButton();
        String actualAge = webTablesPage.getTableAge(email);
        Assert.assertEquals(actualAge,"34","Actual and Expected ages do not match");
    }

}
