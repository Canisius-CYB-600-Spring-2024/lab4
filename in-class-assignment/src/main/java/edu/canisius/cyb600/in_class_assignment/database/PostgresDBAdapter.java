package edu.canisius.cyb600.in_class_assignment.database;

import edu.canisius.cyb600.lab4.dataobjects.Actor;
import edu.canisius.cyb600.lab4.dataobjects.Film;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostgresDBAdapter extends AbstractDBAdapter {

    public PostgresDBAdapter(Connection conn) {
        super(conn);
    }

    @Override
    public List<Film> getAllFilms() {
        //First, we are going to open up a new statement
        try (Statement statement = conn.createStatement()) {
            //This statement is easy
            //Select * from actor is saying "Return all Fields for all rows in films". Because there
            //is no "where clause", all rows are returned
            ResultSet results = statement.executeQuery("Select * from film");
            //Initialize an empty List to hold the return set of films.
            List<Film> films = new ArrayList<>();
            //Loop through all the results and create a new Film object to hold all its information
            while (results.next()) {
                Film film = new Film();
                film.setFilmId(results.getInt("FILM_ID"));
                film.setTitle(results.getString("TITLE"));
                film.setDescription(results.getString("DESCRIPTION"));
                film.setReleaseYear(results.getString("RELEASE_YEAR"));
                film.setLanguageId(results.getInt("LANGUAGE_ID"));
                film.setRentalDuration(results.getInt("RENTAL_DURATION"));
                film.setRentalRate(results.getDouble("RENTAL_RATE"));
                film.setLength(results.getInt("LENGTH"));
                film.setReplacementCost(results.getDouble("REPLACEMENT_COST"));
                film.setRating(results.getString("RATING"));
                film.setSpecialFeatures(results.getString("SPECIAL_FEATURES"));
                film.setLastUpdate(results.getDate("LAST_UPDATE"));
                //Add film to the array
                films.add(film);
            }
            //Return all the films.
            return films;
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public List<Actor> getActorsWithLastName(String lastName) {
        return new ArrayList<>();
    }


    @Override
    public Actor addActor(Actor actor) {
        return actor;
    }

    @Override
    public List<Film> getFilmsForActor(Actor actor) {
        return new ArrayList<>();
    }
}
