package JUnitClasses;

public class Pattern1{
	public String print(int n){
		int i,j;
		String str="";
		for(i=1;i<=n;i++){
			for(j=n-i;j>=1;j--){
				str+="  ";
			}
			for(j=1;j<=i;j++){
				str+=j+" ";
			}
			for(j=i-1;j>=1;j--){
				str+=j+" ";
			}
			str+="\n";
		}
		System.out.println(str);
		return str;
	}
}