package com.company.navigation;

import com.company.Alert.alertView;
import com.company.Deposit.depositView;
import com.company.OptionsBuilder;
import com.company.Printer;
import com.company.Withdraw.withdrawView;
import com.company.prompter;

/**
 * Created by yassin on 2/7/17.
 */
public class NavigationView implements Navigable {

    @Override
    public void render() {

        Printer.ln("Hello from Deposit view");


        Printer.ln("What would you like to do?");

        OptionsBuilder<Navigable> optionsBuilder = new OptionsBuilder<>();
        optionsBuilder.addAction("Withdraw", new withdrawView());
        optionsBuilder.addAction("Deposit", new depositView());
        optionsBuilder.addAction("View text Alert Options", new alertView());

        optionsBuilder.build((navigable) -> {
            navigable.render();
        });


    }
}
