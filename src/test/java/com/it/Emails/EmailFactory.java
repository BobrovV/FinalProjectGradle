package com.it.Emails;

import java.util.ResourceBundle;

public class EmailFactory {
    static ResourceBundle email = ResourceBundle.getBundle("email");

    public static Email getValidEmail(){
        return new Email(email.getString("to"), email.getString("subject"), email.getString("body"));
    }

/*    public static Email getRandomEmail(){
        return new Email(Utils.String.getRandom(10), Constants.TO, Utils.String.getRandom(6), Utils.String.getRandom(6));
    }
    public static List<User> getRandomUsers(int count){
        return Stream.generate((UserFactory::getRandomUser)).limit(count).collect(Collectors.toList());
    }*/
}
