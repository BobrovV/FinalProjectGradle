package com.it;

import com.it.Helpers.CommonHelper;
import com.it.Helpers.DashboardHelper;
import com.it.Helpers.LoginHelper;
import com.it.Helpers.SendEmailHelper;

public class App {
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CommonHelper common;
    public SendEmailHelper sendEmail;

    public App() {
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        common = new CommonHelper();
        sendEmail = new SendEmailHelper();
    }
}
