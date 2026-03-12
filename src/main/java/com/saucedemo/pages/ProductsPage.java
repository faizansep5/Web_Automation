package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private final By productsHeader = By.className("title");

    public boolean isProductsHeaderDisplayed(){
        return find(productsHeader).isDisplayed();
    }
}
