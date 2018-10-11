package lambdaExp;

@FunctionalInterface
interface Addable{
	public int add(int a, int b);
}
public class Addition {
	public static void main(String[]args){
		Addable a1 = (a,b)->a+b;
		System.out.println(a1.add(4,5));
	}
}
