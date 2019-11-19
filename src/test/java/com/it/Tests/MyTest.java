package com.it.Tests;

import com.it.Pages.DashboardPage;
import com.it.Pages.LoginPage;
import com.it.Users.UserFactory;
import com.it.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test1() {
        //System.out.println(UserFactory.getRandomUser());
        //System.out.println(UserFactory.getRandomUsers(20));
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getEmailUser(), validUser.email);
        app.sendEmail.sendEmail(validEmail);
        Assert.assertEquals(app.dashboard.getFirstSubject(), validEmail.subject);
    }
}
