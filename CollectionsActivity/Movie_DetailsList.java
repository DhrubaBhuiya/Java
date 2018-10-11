package CollectionsActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Movie_DetailsList {
	static List<Movie_Details> list = new ArrayList<Movie_Details>();
	public void add_movie(Movie_Details m){
		list.add(m);
	}
	public void remove_movie(String name){
		Iterator<Movie_Details> itr = list.iterator();
		while(itr.hasNext()){
			if(itr.next().getMov_name().equals(name))
				itr.remove();
		}
	}
	public void remove_Allmovie(){
		list.removeAll(list);
	}
	public void find_movie_By_mov_name(String name){
		Iterator<Movie_Details> itr = list.iterator();
		while(itr.hasNext()){
			Movie_Details m = itr.next();
			if(m.getMov_name().equals(name))
				System.out.println(m);
		}
	}
	public void find_movie_By_Genre(String genre){
		Iterator<Movie_Details> itr = list.iterator();
		while(itr.hasNext()){
			Movie_Details m = itr.next();
			if(m.getGenre().equals(genre))
				System.out.println(m);
		}
	}
	public static void main(String[] args) {
		Movie_DetailsList md = new Movie_DetailsList();
		Movie_Details m = new Movie_Details("Avengers", "RDJ", "SJ", "Action");
		md.add_movie(m);
		System.out.println(Movie_DetailsList.list);
		md.remove_movie("Avengers");
		System.out.println(Movie_DetailsList.list);
		md.add_movie(m);
		m = new Movie_Details("Gold", "AK", "MR", "Bio");
		md.add_movie(m);
		m = new Movie_Details("Thor Ragnarok", "CH", "MR", "Action");
		md.add_movie(m);
		md.find_movie_By_mov_name("Gold");
		md.find_movie_By_Genre("Action");
		
		Collections.sort(list, Movie_Details.sortName);
		
		Iterator<Movie_Details> itr = list.iterator();
		while(itr.hasNext()){
			m = itr.next();
			System.out.println(m);
		}
		
		Collections.sort(list, Movie_Details.sortGenre);
		
		itr = list.iterator();
		while(itr.hasNext()){
			m = itr.next();
			System.out.println(m);
		}
	}
}
