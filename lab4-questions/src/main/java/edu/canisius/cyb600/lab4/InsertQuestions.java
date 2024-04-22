package edu.canisius.cyb600.lab4;

import edu.canisius.cyb600.lab4.dataobjects.Actor;
import edu.canisius.cyb600.lab4.jdbc.PostgresConnectionHandler;

import java.util.List;

public class InsertQuestions extends PostgresConnectionHandler {

    /**
     * Insert a list of actors all with an odd number of characters in their last name.
     * @param actors A list of actors to insert. Only insert and return if their last name has an odd number of characters.
     *               Their ID and lastUpdate should be updated from the values coming from the db.
     * @return THe list of characters that were updated.
     */
    public List<Actor> insertAllActorsWithAnOddNumberLastName(List<Actor> actors) {
        return null;
    }

}
