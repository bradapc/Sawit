package application;

public class Movie {
	private int ID;
	private String name;
	private String author;
	private int year;
	private String genre;
	private int rating;
	
	public Movie(String name, String author, int year, String genre, int rating) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.genre = genre;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	public void setGenre(String newGenre) {
		genre = newGenre;
	}
	
	public void setRating(int newRating) {
		rating = newRating;
	}
}
