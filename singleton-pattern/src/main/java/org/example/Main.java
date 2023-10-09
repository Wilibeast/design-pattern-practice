package org.example;

public class Main {
    public static void main(String[] args) {
        //We only want one connection to our database, so we make it singleton
        var database = Database.getInstance();
        database.doDatabaseStuff();

        var anotherDatabase = Database.getInstance();
        anotherDatabase.doDatabaseStuff();
    }
}