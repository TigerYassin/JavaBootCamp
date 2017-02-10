package com.company;

import java.util.Scanner;

/**
 * Created by yassin on 2/7/17.
 */
public class prompter {

    public static void prompt(String text, Action<String> action) {
        Printer.p(text + " ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        action.execute(input);

    }
}
