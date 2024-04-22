package edu.canisius.cyb600.in_class_assignment;

import edu.canisius.cyb600.in_class_assignment.jdbc.PostgresConnectionHandler;
import edu.canisius.cyb600.lab4.dataobjects.Actor;

public class InsertQuestions extends PostgresConnectionHandler {

    /**
     * Given an actor, the actor will be saved in the database.
     * @param actor The actor to be saved
     * @return The same actor object brought in but with its ID and LAST_UPDATE filled in.
     */
    public Actor addActorToDatabase(Actor actor) {
        return this.dbAdapter.addActor(actor);
    }
}
