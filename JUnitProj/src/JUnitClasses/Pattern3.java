package JUnitClasses;

public class Pattern3{
	public String print(int n){
		int i,j;
		String str="";
		for(i=n;i>=1;i--){
			for(j=1;j<=i;j++){
				str+="*";
			}
			str+="\n";
		}
		return str;
	}
}