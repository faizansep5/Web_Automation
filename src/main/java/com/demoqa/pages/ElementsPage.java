package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ElementsPage extends BasePage {
    private final By webTablesMenuItem = By.xpath("//span[text()='Web Tables']/parent::a");

    public WebTablesPage clickWebTables(){
        click(webTablesMenuItem);
        return new WebTablesPage();
    }
}
