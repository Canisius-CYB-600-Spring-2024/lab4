package edu.canisius.cyb600.lab4.database;

import java.sql.Connection;

/**
 * Abstract DB Adapter
 */
public abstract class AbstractDBAdapter {
    Connection conn;

    public AbstractDBAdapter(Connection conn) {
        this.conn = conn;
    }

    //SELECTS

    //INSERTS

    //JOIN


}
