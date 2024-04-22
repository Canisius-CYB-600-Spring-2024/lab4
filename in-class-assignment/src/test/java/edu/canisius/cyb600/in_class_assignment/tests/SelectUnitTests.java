package edu.canisius.cyb600.in_class_assignment.tests;

import edu.canisius.cyb600.in_class_assignment.SelectQuestions;
import edu.canisius.cyb600.lab4.dataobjects.Actor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelectUnitTests {
    SelectQuestions select = new SelectQuestions();

    @Test
    public void testCountOfAllActors() {
        List<Actor> actors = select.getAllActors();
        assertTrue("The correct number of actors where not returned", actors.size() >= 200);
    }

    @Test
    public void testLastNameOfActorWithCode() {
        List<Actor> actors = select.getAllActorsWithLastNameWithCode("damon");
        assertEquals("The correct number of actors where not returned", 1, actors.size());
        assertEquals("The incorrect last name", "DAMON", actors.get(0).getLastName());
        assertEquals("The incorrect First name", "SCARLETT", actors.get(0).getFirstName());
        assertEquals("The incorrect Actor ID", 81, actors.get(0).getActorId());
    }

    @Test
    public void testLastNameOfActor() {
        List<Actor> actors = select.getAllActorsWithLastName("damon");
        assertEquals("The correct number of actors where not returned", 1, actors.size());
        assertEquals("The incorrect last name", "DAMON", actors.get(0).getLastName());
        assertEquals("The incorrect First name", "SCARLETT", actors.get(0).getFirstName());
        assertEquals("The incorrect Actor ID", 81, actors.get(0).getActorId());
    }

}
