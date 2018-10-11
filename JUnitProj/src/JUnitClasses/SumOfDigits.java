package JUnitClasses;

public class SumOfDigits{
	public int sum(int n){
		int d,s=0;
		while(n>0){
			d=n%10;
			s+=d;
			n/=10;
		}
		return s;
	}
}