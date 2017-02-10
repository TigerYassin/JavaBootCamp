package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yassin on 2/8/17.
 */
public class OptionsBuilder<T> { //we created an action T todo learn about actions

    private List<String> titles = new ArrayList<>();
    private List<T> options = new ArrayList<T>();

   public void addAction(String title, T action) {
       titles.add(title);
       options.add(action);
   }

   public void build(Action<T> action) {
       for(int i = 0; i < titles.size(); i++) {

           String title = titles.get(1);
           String currentNumber = Integer.toString(i + 1);
           String text = "[" + currentNumber + "] " + title;
           Printer.ln(text);
           Printer.l();
       }

       prompter.prompt(" ", (text) ->  {
           int selectedOptionText = Integer.parseInt(text);
           T selectionOption = options.get(selectedOptionText - 1);
           action.execute(selectionOption);
       });

   }
}
