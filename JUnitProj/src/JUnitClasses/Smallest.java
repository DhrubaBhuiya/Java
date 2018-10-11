package JUnitClasses;
public class Smallest{ 
	public int min(int a,int b,int c){
		int min;
		if(a>b)min=b;		    
		else min=a;		        
		if(min>c)min=c;		        
		return min;    
	}
}