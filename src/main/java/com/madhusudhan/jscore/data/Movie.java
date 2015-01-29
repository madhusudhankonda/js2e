package com.madhusudhan.jscore.data;

import java.sql.Date;

public class Movie {

	private String ID  = null;
	
	private String genre = null;
	
	private String synopsis = null;
	
    private String title = null;
	
	private String stars = null;
	
	private Date releaseDate = null;
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getSynopsis() {
		return synopsis;
	}

	
	
	


}
