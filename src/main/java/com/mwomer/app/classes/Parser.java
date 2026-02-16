package com.mwomer.app.classes;
import com.mwomer.app.classes.Dispatchable;


public class Parser {


    public Parser() {
        System.out.println("Initializing Parser");
    }

    public Dispatchable parseCommand(String [] args) {

        if (args.length == 0) {
            return new Dispatchable(true, "No command provided", "");
        }

        //individual command parsing

        if (args[0].equals("help")) {
            System.out.println("Insert description here");
            return new Dispatchable(false, "", "help");
        }

        else if (args[0].equals("ingest")) {
            if (args.length != 2) {
                return new Dispatchable(true, "Invalid number of arguments.  Command usage: ingest <filepath>", "ingest");
            } else {
                return new Dispatchable(false, "ingest", args); // should refactor to only input args[1:onward], as args[0] is command
            }
        }

        else if (args[0].equals("search")) {
             if (args.length != 3) {
                return new Dispatchable(true, "Invalid number of arguments.  Command usage: search <filepath> <search_term>", "search");
            }
        }
        else {
            return new Dispatchable(true, "Invalid command.  Use help to view a list of avaliable commands");
        }

        //
        return new Dispatchable(true, "Unidentified error");
    }

    
}