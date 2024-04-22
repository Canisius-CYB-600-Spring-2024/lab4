package edu.canisius.cyb600.in_class_assignment;

import edu.canisius.cyb600.in_class_assignment.jdbc.PostgresConnectionHandler;
import edu.canisius.cyb600.lab4.dataobjects.Actor;
import edu.canisius.cyb600.lab4.dataobjects.Film;

import java.util.List;

public class JoinQuestions extends PostgresConnectionHandler {
    /**
     * The films in which a particular actor was a part of.
     * @param actor The actor in question
     * @return a List of films where the actor is involved.
     */
    public List<Film> getFilmsForActor(Actor actor) {
        return this.dbAdapter.getFilmsForActor(actor);
    }
}
