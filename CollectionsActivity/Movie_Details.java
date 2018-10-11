package CollectionsActivity;

import java.util.Comparator;

public class Movie_Details {
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	
	public Movie_Details(String mov_name, String lead_actor, String lead_actress, String genre) {
		this.mov_Name = mov_name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	public String getMov_name() {
		return mov_Name;
	}
	public void setMov_name(String mov_name) {
		this.mov_Name = mov_name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String toString(){
		return mov_Name+" "+lead_actor+" "+lead_actress+" "+genre;
	}
	
	public static Comparator<Movie_Details> sortName = new Comparator<Movie_Details>() {
		
		@Override
		public int compare(Movie_Details o1, Movie_Details o2) {
			String m1 = o1.getMov_name();
			String m2 = o2.getMov_name();
			return m1.compareTo(m2);
		}
	};
	
	public static Comparator<Movie_Details> sortGenre = new Comparator<Movie_Details>() {
		
		@Override
		public int compare(Movie_Details o1, Movie_Details o2) {
			return o1.genre.compareTo(o2.genre);
		}
	};
	
}
