package com.company.Deposit;

import com.company.Printer;
import com.company.navigation.Navigable;

/**
 * Created by yassin on 2/8/17.
 */
public class depositView implements Navigable {

    @Override
    public void render() {

        Printer.ln("Hello from Deposit view");

    }
}
