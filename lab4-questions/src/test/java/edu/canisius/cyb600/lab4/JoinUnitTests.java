package edu.canisius.cyb600.lab4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.canisius.cyb600.lab4.dataobjects.Category;
import edu.canisius.cyb600.lab4.dataobjects.Film;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * STUDENTS SHOULD NOT EDIT THIS FILE.
 */
public class JoinUnitTests {
    JoinQuestions joinQuestions = new JoinQuestions();
    ClassLoader classLoader = getClass().getClassLoader();
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testGetFilmsInCategory() throws IOException {
        List<Film> comedyFilms = joinQuestions.getFilmsInCategory(new Category(5, "Comedy", new Date()));
        List<Film> sportsFilms = joinQuestions.getFilmsInCategory(new Category(15, "Sports", new Date()));
        List<Film> actionFilms = joinQuestions.getFilmsInCategory(new Category(1, "Action", new Date()));

        comedyFilms = comedyFilms.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        sportsFilms = sportsFilms.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        actionFilms = actionFilms.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());

        List<Film> comedyJson = objectMapper.readValue(new File(classLoader.getResource("FILM_COMEDY.json").getFile()),
                new TypeReference<List<Film>>() {
                });
        List<Film> sportsJson = objectMapper.readValue(new File(classLoader.getResource("FILM_SPORTS.json").getFile()),
                new TypeReference<List<Film>>() {
                });
        List<Film> actionJson = objectMapper.readValue(new File(classLoader.getResource("FILM_ACTION.json").getFile()),
                new TypeReference<List<Film>>() {
                });

        comedyJson = comedyJson.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        sportsJson = sportsJson.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        actionJson = actionJson.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());

        assertEquals("Lists do not match", comedyJson, comedyFilms);
        assertEquals("Lists do not match", sportsJson, sportsFilms);
        assertEquals("Lists do not match", actionJson, actionFilms);
    }
}
