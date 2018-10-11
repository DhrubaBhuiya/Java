import java.util.*;

public class Smallest{
    
public static void main(String[]args){
        
int a,b,c,min;
        
System.out.println("Enter 3 numbers\n");
        
Scanner sc = new Scanner(System.in);
        
a=sc.nextInt();
        
b=sc.nextInt();
        
c=sc.nextInt();
        
if(a>b)min=b;
        
else min=a;
        
if(min>c)min=c;
        
System.out.println("The minimum number is: "+min);
    
}

}