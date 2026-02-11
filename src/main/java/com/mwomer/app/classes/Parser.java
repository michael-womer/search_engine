package com.mwomer.app.classes;



public class Parser {

    

    public Parser(String[] args) {
        System.out.println("Initializing Parser");

        if (args.length == 0) {
            System.out.println("No command provided");
            return;
        }

        //individual command parsing

        if (args[0].equals("help")) {
            System.out.println("Insert description here");
            return;
        }

        if (args[0].equals("ingest")) {
            if (args.length != 2) {
                System.out.println("Invalid number of arguments.  Command usage: ingest <filepath>");
                return;
            }
        }

        if (args[0].equals("search")) {
             if (args.length != 3) {
                System.out.println("Invalid number of arguments.  Command usage: search <filepath> <search_term>");
                return;
            }
        }
       
        
    }

    
}