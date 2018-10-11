package ExceptionHandling;

import java.util.regex.Pattern;

public class Student {	
	int roll;
	String name;
	int age;
	String course;
	public Student(int roll, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException{
		this.age=age;
		this.course=course;
		this.name=name;
		this.roll=roll;
		
		if(age<15||age>21)
			throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		for(int i=0;i<name.length();i++){
			if(!Pattern.matches("[a-zA-z ]+", name))
				throw new NameNotValidException("Name should not contain special characters or numbers");
		}
	}
}
