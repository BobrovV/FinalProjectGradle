package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath="//li[@class='sn_menu_item']/span")
    private WebElement lbUserEmail;

    @FindBy(xpath="//form[@name='aform']//span[@class='sbj'][1]")
    private WebElement lbFirstSubject;

    public String getEmailUser() {
        return lbUserEmail.getText();
    }

    public String getFirstSubject() {
        return lbFirstSubject.getText();
    }
}
