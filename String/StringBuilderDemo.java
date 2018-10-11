package String;

public class StringBuilderDemo {
	public static void main(String[]args){
		String str = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		
		String s[] = str.split("\\\\");
		StringBuilder sb = new StringBuilder();
		System.out.println("Drive: "+s[0]+"\\");
		sb.append(s[1]);
		sb.append("||");
		sb.append(s[2]);
		sb.append("||");
		sb.append(s[3]);
		System.out.println("Folders: "+sb);
		System.out.println("File: "+s[4]);
	}
}
