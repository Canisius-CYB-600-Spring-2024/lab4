package edu.canisius.cyb600.lab4.dataobjects;

import java.util.Date;
import java.util.Objects;

/**
 * Data Object for Film
 */
public class Film {
    private int filmId, languageId, originalLanguageId, rentalDuration, length;
    private double rentalRate, replacementCost;
    private String title, description, releaseYear, rating, specialFeatures;
    private Date lastUpdate;

    public Film() {
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public int getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(int originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return filmId == film.filmId && languageId == film.languageId && originalLanguageId == film.originalLanguageId && rentalDuration == film.rentalDuration && length == film.length && Double.compare(film.rentalRate, rentalRate) == 0 && Double.compare(film.replacementCost, replacementCost) == 0 && Objects.equals(title, film.title) && Objects.equals(description, film.description) && Objects.equals(releaseYear, film.releaseYear) && Objects.equals(rating, film.rating) && Objects.equals(specialFeatures, film.specialFeatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, languageId, originalLanguageId, rentalDuration, length, rentalRate, replacementCost, title, description, releaseYear, rating, specialFeatures);
    }
}
