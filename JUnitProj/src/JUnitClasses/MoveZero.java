package JUnitClasses;
public class MoveZero{
	public int[] move(int[]arr){
		int i,k=0,c=0;
		int arr1[]=new int[arr.length];
		for(i=0;i<arr.length;i++){
			if(arr[i]==0)c++;
			else{
				arr1[k]=arr[i];
				k++;
			}
		}
		for(i=1;i<=c;i++)arr1[k++]=0;
		return arr1;
	}
}