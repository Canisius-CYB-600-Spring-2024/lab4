package edu.canisius.cyb600.lab4.database;

import java.sql.Connection;

/**
 * Posgres Implementation of the db adapter.
 */
public class PostgresDBAdapter extends AbstractDBAdapter {

    public PostgresDBAdapter(Connection conn) {
        super(conn);
    }


}
