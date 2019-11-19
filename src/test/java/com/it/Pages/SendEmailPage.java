package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendEmailPage extends BasePage{
	@FindBy(xpath="//p[@class='make_message']/a")
    private WebElement btnCreateEmail;

    @FindBy(xpath="//textarea[@id='to']")
    private WebElement inputTo;

    @FindBy(xpath="//input[@name='subject']")
    private WebElement inputSubject;

    @FindBy(xpath="//textarea[@id='text']")
    private WebElement inputBody;

    @FindBy(xpath="//p[@class='send_container']/input[@name='send']")
    private WebElement btnSend;

    @FindBy(xpath = "//ul[@class='list_underlined']//li[1]/a")
    private WebElement linkInbox;

    public void sendEmail(String email, String subject, String message){
        btnCreateEmail.click();
        inputTo.sendKeys(email);
        inputSubject.sendKeys(subject);
        inputBody.sendKeys(message);
        btnSend.click();
        linkInbox.click();
    }
}
