package String;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is StringBuffer");
		sb.append("- This is a sample program");
		System.out.println(sb);
		sb.insert(20, "Object");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.replace(sb.indexOf("Buffer"),sb.indexOf("Buffer")+"Buffer".length(), "Builder");
		System.out.println(sb);
	}

}
