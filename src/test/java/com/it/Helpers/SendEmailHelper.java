package com.it.Helpers;

import com.it.Pages.SendEmailPage;
import com.it.Users.Email;

public class SendEmailHelper extends SendEmailPage {
    public void sendEmail(Email email){
        sendEmail(email.to, email.subject, email.body);
    }
}
