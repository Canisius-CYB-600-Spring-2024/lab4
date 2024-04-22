package edu.canisius.cyb600.in_class_assignment.tests;

import edu.canisius.cyb600.in_class_assignment.JoinQuestions;
import edu.canisius.cyb600.lab4.dataobjects.Actor;
import edu.canisius.cyb600.lab4.dataobjects.Film;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class JoinUnitTests {
    JoinQuestions join = new JoinQuestions();

    @Test
    public void testFilmsByActor() {
        Actor actor = new Actor(55, "FAY", "KILMER", null);
        List<Film> films = join.getFilmsForActor(actor);

        assertEquals("Incorrect amount of films", 20, films.size());
    }
}
