package edu.canisius.cyb600.lab4;

import edu.canisius.cyb600.lab4.dataobjects.Category;
import edu.canisius.cyb600.lab4.dataobjects.Film;
import edu.canisius.cyb600.lab4.jdbc.PostgresConnectionHandler;

import java.util.List;

public class JoinQuestions extends PostgresConnectionHandler {
    /**
     * Given a category, return all the films of that category/
     * @param category A stirng category to narrow the select / join statement
     * @return A list of films.
     */
    public List<Film> getFilmsInCategory(Category category) {
        return null;
    }
}
