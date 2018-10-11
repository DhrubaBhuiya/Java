import java.util.*;
public class Discount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float newItem,discount,newItemPrice;
		System.out.println("Enter price of the item: ");
		newItem=sc.nextFloat();
		discount=newItem*35/100;
		newItemPrice=newItem-discount;
		System.out.println("The discounted price is: "+newItemPrice);
	}

}
