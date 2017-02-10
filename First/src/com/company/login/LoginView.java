package com.company.login;

import com.company.Action;
import com.company.LoginCredentials;
import com.company.Printer;
import com.company.navigation.NavigationView;
import com.company.prompter;

import java.util.Scanner;

/**
 * Created by yassin on 2/7/17.
 */
public class LoginView {
    static Printer myP = new Printer();

    public static void render() {

        Printer.ln("Welcome to the banking application! Please enter your account");
        LoginCredentials.Builder builder = new LoginCredentials.Builder();

        
        prompter.prompt("Card Number: ", variable -> {
           builder.setCardNumber(variable);
        });
        prompter.prompt("Pin: ", (input) ->{
            builder.setPin(input);
            });

        LoginPermission presenter = new LoginPermission();
        LoginCredentials credentials = builder.build();

        boolean pinIsValid = presenter.LoginPermission(credentials.getCardNumber(), credentials.getPin());


        if (pinIsValid) {

           //todo: remove comment when AccountView is implemented

            new NavigationView().render();
        }
        else {
            myP.p("Something went wrong");
        }

    }


}
