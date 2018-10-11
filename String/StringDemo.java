package String;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("Welcome to Java World");
		System.out.println("Character at 5th position: "+str.charAt(4));
		int res = str.compareToIgnoreCase("Welcome");
		System.out.println("Comparison result: "+res);
		System.out.println(str.concat("- Let us learn"));
		res = str.indexOf('a');
		System.out.println("First occurance of a is at index-"+res);
		System.out.println(str.replace('a', 'e'));
		System.out.println(str.substring(3,10));
		System.out.println(str.toLowerCase());
	}

}
