package JUnitClasses;
public class LargestElem{
	public int[] largest(int[]arr){
		int i,j,temp;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int[] arr1={arr[0],arr[1],arr[2]};
		return arr1;
	}
}