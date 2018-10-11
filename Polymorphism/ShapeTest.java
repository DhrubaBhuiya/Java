package Polymorphism;
public class ShapeTest {
	public static void main(String args[]){
		Shape s1 = new Circle(5.0,"Red",true);
		Shape s2 = new Rectangle(5.0,10.0,"Blue",false);
		Shape s3 = new Square(15.0,"Green",true);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
