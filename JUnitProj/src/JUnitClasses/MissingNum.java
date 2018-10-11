package JUnitClasses;
public class MissingNum{
	public int miss(int[]arr){
		int i,j,f=0;
		for(i=1;i<=arr.length+1;i++){
			f=0;
			for(j=0;j<arr.length;j++){
				if(arr[j]==i){
					f=1;
					break;
				}
			}
			if(f==0){
				return i;
			}
		}
		return 0;
	}
}