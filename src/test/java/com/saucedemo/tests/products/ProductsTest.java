package com.saucedemo.tests.products;

import com.saucedemo.base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        var productsPage = loginPage.loginToApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(),"Products header is not displayed.");
    }
}
