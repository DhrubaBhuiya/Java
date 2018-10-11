package Inheritance;
public class InheritanceTest {
	public static void main(String[] args) {
		Person p1 = new Student("Dhruba","Kolkata","CSE",2018,50000);
		Person p2 = new Staff("Raj","Mumbai","RCCIIT",30000);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
