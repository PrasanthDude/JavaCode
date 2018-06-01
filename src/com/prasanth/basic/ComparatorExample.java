package com.prasanth.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;
    
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
   
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    public double getRating() 
    { 
    	return rating; 
    }
    public String getName()   
    {  
    	return name; 
    }
    public int getYear()      {
    	return year;  
    }
}
class RatingCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating()) 
        	return -1;
        if (m1.getRating() > m2.getRating()) 
        	return 1;
        else return 0;
    }
}
class NameCompare implements Comparator<Movie>
{
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}
 

class ComparatorExample
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Mersal", 8.3, 2015));
        list.add(new Movie("Enthiran", 8.7, 1977));
        list.add(new Movie("Sura", 8.8, 1980));
        list.add(new Movie("Bahuballi", 8.4, 1983));
        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        
        for (Movie movie: list)
            System.out.println(movie.getRating()+ " " +movie.getName() + " " +movie.getYear());
            System.out.println("Sorted by name");
            NameCompare nameCompare = new NameCompare();
            Collections.sort(list, nameCompare);
        
        for (Movie movie: list)
        	
            System.out.println(movie.getName() + " " +movie.getRating() + " " +movie.getYear());
            System.out.println("Sorted by year");
            Collections.sort(list);
        for (Movie movie: list)
            System.out.println(movie.getYear() + " " +movie.getRating() + " " +movie.getName()+" ");
    }
}  