package com.example.filmtracker;

import java.util.ArrayList;

public class Collection {

    static ArrayList<Movie> collection = new ArrayList<Movie>();

    public static void addToCollection(Movie m) {
        collection.add(m);
    }

    public static ArrayList<Movie> getCollection() {
        return collection;
    }

}