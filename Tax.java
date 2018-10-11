import java.util.*;
public class Tax {
	public static void main(String[] args){
		double ctc,tax=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ctc: ");
		ctc=sc.nextDouble();
		if(ctc>180000&&ctc<=300000)tax=ctc*10/100;
		else if(ctc>300000&&ctc<=500000)tax=ctc*20/100;
		else if(ctc>500000&&ctc<=1000000)tax=ctc*30/100;	
		System.out.println("Tax is: "+tax);
	}
}
