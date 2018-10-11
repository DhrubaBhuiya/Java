package JUnitClasses;
public class Swap1{
	public int[] swap(int a, int b){
		int c;
		c=a;
		a=b;
		b=c;
		int[]res={a,b};
		return res;
	}
}