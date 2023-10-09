package org.example;

import java.time.LocalDateTime;

public class Database {
    private static Database instance;
    private final LocalDateTime initializedTimestamp;

    public Database() {
        this.initializedTimestamp = LocalDateTime.now();
    }
    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void doDatabaseStuff() {
        System.out.printf("Initialized on %s %n", initializedTimestamp.toString());
        System.out.println("Doing database stuff...");
    }
}
