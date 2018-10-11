package JUnitClasses;

public class Pattern2{
	public String print(int n){
		int i,j;
		String str="";
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				str+=j;
			}
			str+="\n";
		}
		return str;
	}
}