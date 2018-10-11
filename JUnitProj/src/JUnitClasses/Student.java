package JUnitClasses;

public class Student{
	public int check(int[]arr){
		int c=0;
		for(int i=0;i<20;i++){
			if(arr[i]>=86)c++;
		}
		return c;
	}
}