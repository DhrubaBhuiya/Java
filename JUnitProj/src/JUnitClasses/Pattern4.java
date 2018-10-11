package JUnitClasses;

public class Pattern4{
	public String print(int n){
		int i,j,p=65;
		String str="";
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				str+=(char)p;
			}
			p++;
			str+="\n";
		}
		return str;
	}
}