package com.mwomer.app;
import com.mwomer.app.classes.Parser;
import com.mwomer.app.classes.Dispatchable;


public class App {
    public static void main(String[] args) {

        Parser parser = new Parser();
        Dispatchable dispatchable = parser.parseCommand(args);

        dispatchable.execute();

    }
}
