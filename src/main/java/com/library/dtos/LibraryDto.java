package com.library.dtos;

public class LibraryDto {

	private String name;
	private String type;
	private String genre;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "LibraryDto [name=" + name + ", type=" + type + ", genre=" + genre + "]";
	}

}
