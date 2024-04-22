package edu.canisius.cyb600.lab4.jdbc;


import edu.canisius.cyb600.lab4.database.AbstractDBAdapter;
import edu.canisius.cyb600.lab4.database.PostgresDBAdapter;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Connects to the db.
 * STUDENTS SHOULD NOT TOUCH THIS FILE.
 */
public class PostgresConnectionHandler {
    protected AbstractDBAdapter dbAdapter;
    private Connection connection = null;

    public PostgresConnectionHandler() {
        createConnection();
        this.dbAdapter = new PostgresDBAdapter(connection);
    }

    private void createConnection() {
        try {
            connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "sakila");
            System.out.println("Opened database successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
