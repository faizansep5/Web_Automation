package com.demoqa.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class WebTablesPage extends BasePage {

    private final By registrationAgeField = By.id("age");
    private final By submitButton = By.cssSelector("button#submit");

    public void clickEdit(String email){
        click(By.xpath("//td[text()='"+ email +"']/following-sibling::td[3]/div/span[@title='Edit']"));
    }

    public void setAge(String age){
        set(registrationAgeField,age);
    }
    public void clickSubmitButton(){
        click(submitButton);
    }
    public String getTableAge(String email){
        By tableAge = By.xpath("//td[text()='"+ email +"']/preceding-sibling::td[1]");
        return find(tableAge).getText();
    }
}
