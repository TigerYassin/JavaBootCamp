package com.company.Alert;

import com.company.Action;
import com.company.OptionsBuilder;
import com.company.Printer;
import com.company.navigation.Navigable;

import static com.sun.corba.se.spi.servicecontext.MaxStreamFormatVersionServiceContext.singleton;
import static java.awt.SystemColor.text;

/**
 * Created by yassin on 2/8/17.
 */
public class alertView implements Navigable {

    @Override
    public void render() {

        Printer.l();
        Printer.ln("Hello from alert view");

        OptionsBuilder<Action> optionsBuilder = new OptionsBuilder();
        AlertsSingleton singleton = AlertsSingleton.getInstance();

        optionsBuilder.addAction("Deposit Alerts On", (text) ->{
            // turn on deposit alerts
            singleton.toggleDepositAlerts();
        });

        optionsBuilder.addAction("Withdraw Alerts on", (text) ->{
            //turn on withdraw alerts
            singleton.toggleDepositAlerts();
        });

        optionsBuilder.addAction("Deposit alerts off", (text) -> {
            //turn deposit alerts off
            singleton.toggleDepositAlerts();
        });

        optionsBuilder.addAction("Withdraw alerts off", (text) -> {
            //turn withdraw alerts off
            singleton.toggleDepositAlerts();
        });

        optionsBuilder.build((action) -> {
            action.execute(null);
        });
    }
}
