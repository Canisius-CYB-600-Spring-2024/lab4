package edu.canisius.cyb600.in_class_assignment.jdbc;

import edu.canisius.cyb600.in_class_assignment.database.AbstractDBAdapter;
import edu.canisius.cyb600.in_class_assignment.database.PostgresDBAdapter;

import java.sql.Connection;
import java.sql.DriverManager;

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
