package edu.canisius.cyb600.lab4;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.canisius.cyb600.lab4.dataobjects.Actor;
import edu.canisius.cyb600.lab4.dataobjects.Film;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * STUDENTS SHOULD NOT EDIT THIS FILE.
 */
public class SelectUnitTests {
    ClassLoader classLoader = getClass().getClassLoader();
    ObjectMapper objectMapper = new ObjectMapper();

    SelectQuestions select = new SelectQuestions();

    String[] staticCategories = new String[]{
            "Comedy",
            "Action",
            "Horror",
            "New",
            "Travel",
            "Music",
            "Sports",
            "Documentary",
            "Drama",
            "Foreign",
            "Games",
            "Classics",
            "Animation",
            "Family",
            "Sci-Fi",
            "Children",
    };

    @Test
    public void testGetAllDistinctCategories() {
        List<String> categories = select.getAllDistinctCategoryNames();
        assertNotNull("Categories is null.", categories);
        assertEquals("Category List is the wrong size", categories.size(), 16);
        assertTrue("Categories lists don't match.", categories.containsAll(List.of(staticCategories)));
    }

    @Test
    public void testGetAllFilmsWithALengthLongerThanX() throws IOException {
        List<Film> filmsOverThree = select.getAllFilmsWithALengthLongerThanX(3);
        List<Film> filmsOverSixty = select.getAllFilmsWithALengthLongerThanX(60);
        List<Film> filmsOverOneTwenty = select.getAllFilmsWithALengthLongerThanX(120);
        List<Film> filmsOverOneSixty = select.getAllFilmsWithALengthLongerThanX(160);

        assertNotNull("Giving Null results", filmsOverThree);
        assertNotNull("Giving Null results", filmsOverSixty);
        assertNotNull("Giving Null results", filmsOverOneTwenty);
        assertNotNull("Giving Null results", filmsOverOneSixty);

        filmsOverThree = filmsOverThree.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        filmsOverSixty = filmsOverSixty.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        filmsOverOneTwenty = filmsOverOneTwenty.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        filmsOverOneSixty = filmsOverOneSixty.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());

        List<Film> threeJson = objectMapper.readValue(new File(classLoader.getResource("FILM_30.json").getFile()),
                new TypeReference<List<Film>>() {
                });
        List<Film> sixtyJson = objectMapper.readValue(new File(classLoader.getResource("FILM_60.json").getFile()),
                new TypeReference<List<Film>>() {
                });
        List<Film> oneTwentyJson = objectMapper.readValue(new File(classLoader.getResource("FILM_120.json").getFile()),
                new TypeReference<List<Film>>() {
                });
        List<Film> oneSixtyJson = objectMapper.readValue(new File(classLoader.getResource("FILM_160.json").getFile()),
                new TypeReference<List<Film>>() {
                });

        threeJson = threeJson.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        sixtyJson = sixtyJson.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        oneTwentyJson = oneTwentyJson.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());
        oneSixtyJson = oneSixtyJson.stream().sorted(Comparator.comparing(Film::getFilmId)).collect(Collectors.toList());


        assertEquals("Lists do not match", threeJson, filmsOverThree);
        assertEquals("Lists do not match", sixtyJson, filmsOverSixty);
        assertEquals("Lists do not match", oneTwentyJson, filmsOverOneTwenty);
        assertEquals("Lists do not match", oneSixtyJson, filmsOverOneSixty);

    }

    @Test
    public void testGetActorsFirstNameStartingWithX() throws IOException {
        List<Actor> actorsStartingWithA = select.getActorsFirstNameStartingWithX('A');
        List<Actor> actorsStartingWithB = select.getActorsFirstNameStartingWithX('B');
        List<Actor> actorsStartingWithC = select.getActorsFirstNameStartingWithX('C');
        List<Actor> actorsStartingWithD = select.getActorsFirstNameStartingWithX('D');

        actorsStartingWithA = actorsStartingWithA.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());
        actorsStartingWithB = actorsStartingWithB.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());
        actorsStartingWithC = actorsStartingWithC.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());
        actorsStartingWithD = actorsStartingWithD.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());

        List<Actor> actorAJson = objectMapper.readValue(new File(classLoader.getResource("ACTOR_A.json").getFile()),
                new TypeReference<List<Actor>>() {
                });
        List<Actor> actorBJson = objectMapper.readValue(new File(classLoader.getResource("ACTOR_B.json").getFile()),
                new TypeReference<List<Actor>>() {
                });
        List<Actor> actorCJson = objectMapper.readValue(new File(classLoader.getResource("ACTOR_C.json").getFile()),
                new TypeReference<List<Actor>>() {
                });
        List<Actor> actorDJson = objectMapper.readValue(new File(classLoader.getResource("ACTOR_D.json").getFile()),
                new TypeReference<List<Actor>>() {
                });

        actorAJson = actorAJson.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());
        actorBJson = actorBJson.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());
        actorCJson = actorCJson.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());
        actorDJson = actorDJson.stream().sorted(Comparator.comparing(Actor::getActorId)).collect(Collectors.toList());

        assertEquals("Lists do not match", actorAJson, actorsStartingWithA);
        assertEquals("Lists do not match", actorBJson, actorsStartingWithB);
        assertEquals("Lists do not match", actorCJson, actorsStartingWithC);
        assertEquals("Lists do not match", actorDJson, actorsStartingWithD);

    }

}
