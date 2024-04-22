package edu.canisius.cyb600.lab4;

import edu.canisius.cyb600.lab4.dataobjects.Actor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * STUDENTS SHOULD NOT EDIT THIS FILE.
 */
public class InsertUnitTests {
    InsertQuestions insert = new InsertQuestions();

    @Test
    public void testInsertAllActorsWithAnOddNumberLastName() {
        Actor actor1 = new Actor();
        actor1.setFirstName("Raymond");
        actor1.setLastName("Plumber");
        Actor actor2 = new Actor();
        actor2.setFirstName("James");
        actor2.setLastName("Craig");
        Actor actor3 = new Actor();
        actor3.setFirstName("Kyle");
        actor3.setLastName("Justin");
        Actor actor4 = new Actor();
        actor4.setFirstName("Zrew");
        actor4.setLastName("Scarpolini");
        Actor actor5 = new Actor();
        actor5.setFirstName("Ten");
        actor5.setLastName("Benjamin");

        List<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);
        actors.add(actor4);
        actors.add(actor5);

        List<Actor> outputActors = insert.insertAllActorsWithAnOddNumberLastName(actors);


        assertEquals("Not the correct amount of actors", 3, outputActors.size());
        assertTrue("Actor 1 is incorrect", outputActors.get(0).getActorId() != 0);
        assertEquals("Actor 1 is incorrect", actor3.getFirstName(), outputActors.get(0).getFirstName());
        assertEquals("Actor 1 is incorrect", actor3.getLastName(), outputActors.get(0).getLastName());
        assertNotNull("Actor 1 is incorrect", outputActors.get(0).getLastUpdate());

        assertTrue("Actor 2 is incorrect", outputActors.get(1).getActorId() != 0);
        assertEquals("Actor 2 is incorrect", actor4.getFirstName(), outputActors.get(1).getFirstName());
        assertEquals("Actor 2 is incorrect", actor4.getLastName(), outputActors.get(1).getLastName());
        assertNotNull("Actor 2 is incorrect", outputActors.get(1).getLastUpdate());

        assertTrue("Actor 3 is incorrect", outputActors.get(2).getActorId() != 0);
        assertEquals("Actor 3 is incorrect", actor5.getFirstName(), outputActors.get(2).getFirstName());
        assertEquals("Actor 3 is incorrect", actor5.getLastName(), outputActors.get(2).getLastName());
        assertNotNull("Actor 3 is incorrect", outputActors.get(2).getLastUpdate());
    }
}

