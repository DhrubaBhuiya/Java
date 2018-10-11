package JUnitClasses;
public class Swap2{
	public int[] swap(int a, int b){
		a=a+b;
		b=a-b;
		a=a-b;
		int[]res={a,b};
		return res;
	}
}