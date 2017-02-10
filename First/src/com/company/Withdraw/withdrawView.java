package com.company.Withdraw;

import com.company.Alert.AlertsSingleton;
import com.company.Printer;
import com.company.navigation.Navigable;


/**
 * Created by yassin on 2/8/17.
 */


public class withdrawView implements Navigable {

    @Override
    public void render() {


        Printer.ln("Hello from withdraw view!");
        AlertsSingleton singleton = AlertsSingleton.getInstance();

        if (singleton.isWithdrawAlertsOn()) {
            //send a text message
        }

    }
}
