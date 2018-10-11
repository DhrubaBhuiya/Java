package CollectionsActivity;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String school_district;
	private String greatSchoolRanking;
	public School(String name, String city, String school_district,
			String greatSchoolRanking) {
		this.name = name;
		this.city = city;
		this.school_district = school_district;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchool_district() {
		return school_district;
	}
	public void setSchool_district(String school_district) {
		this.school_district = school_district;
	}
	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(String greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public boolean equals(Object o){
		School l = (School)o;
		if(this.name.equals(l.name)&&this.city.equals(l.city)&&this.school_district.equals(l.school_district))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,city,school_district);
	}
	
}
