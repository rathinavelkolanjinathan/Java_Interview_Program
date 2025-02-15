package org.test.comparator;

public class Comparable_Test implements Comparable {
	
	//Optional op=
	private double rating; 
    private String name; 
    private int year; 
	public Comparable_Test(double rating, String name, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	
	/**
	 * @return the name
	 *
	 *   760/
	public String getName() {
		return name;
	}
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
