package application;

import java.util.ArrayList;

public class Collection {

	ArrayList<Movie> collection = new ArrayList<Movie>();
	
	public void addToCollection(Movie m) {
		collection.add(m);
	}
	
	public ArrayList<Movie> getCollection() {
		return collection;
	}
	
}
