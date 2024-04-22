package edu.canisius.cyb600.in_class_assignment.tests;

import edu.canisius.cyb600.in_class_assignment.InsertQuestions;
import edu.canisius.cyb600.lab4.dataobjects.Actor;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertUnitTests {
    InsertQuestions insert = new InsertQuestions();

    @Test
    public void testCountOfAllActors() {
        Actor actor = new Actor();
        actor.setFirstName("FirstName");
        actor.setLastName("LastName");
        Actor checkActor = insert.addActorToDatabase(actor);
        assertTrue("Actor Id is set and over the base 200", checkActor.getActorId() > 200);
        assertEquals("First Name is incorrect", "FirstName", actor.getFirstName());
        assertEquals("Last Name is incorrect", "LastName", actor.getLastName());
        assertNotNull("Last Update is Null", actor.getLastUpdate());
    }
}
