package edu.canisius.cyb600.lab4;

import edu.canisius.cyb600.lab4.dataobjects.Actor;
import edu.canisius.cyb600.lab4.dataobjects.Film;
import edu.canisius.cyb600.lab4.jdbc.PostgresConnectionHandler;

import java.util.List;

public class SelectQuestions extends PostgresConnectionHandler {

    /**
     * Return all unique categories from the "Category" table in the Sakila database
     * @return A list of Strings that represent the categories.
     */
    public List<String> getAllDistinctCategoryNames() {
        return null;
    }

    /**
     * Returns a list of Films with the length longer than a particular value.
     * @param length the length the check in the database.
     * @return A list of films with a length longer than "length"
     */
    public List<Film> getAllFilmsWithALengthLongerThanX(int length) {
        return null;
    }

    /**
     * Returns a list of actors that all start with a particular character in their first name
     * @param firstLetter the first letter in the first name.
     * @return A list of actors all sharing the first letter in the first name.
     */
    public List<Actor> getActorsFirstNameStartingWithX(char firstLetter) {
        return null;
    }
}

