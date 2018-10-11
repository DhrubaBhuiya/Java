package lambdaExp;
@FunctionalInterface
interface Interf{
	public void add(int a,int b);
	default void m1(){
		System.out.println("Default method");
	}
	static void m2(){
		System.out.println("Static method");
	}
}
public class Test {
	public static void main(String[]args){
		Interf i1 = (a,b) -> System.out.println("The sum is: "+(a+b));
		i1.add(5,10);
		i1.m1();
		Interf.m2();
	}
}
