package CollectionsActivity;

import java.util.Set;

public class CollectionsDemo {
	public static void main(String[]args){
		Laptop l1 = new Laptop("Dell", "Inspiron", "Windows", "Intel");
		Laptop l2 = new Laptop("Dell", "Inspiron", "Ubuntu", "Intel");
		Laptop l3 = new Laptop("HP", "Pavillion", "Windows", "AMD");
		
		Car c1 = new Car("Fiat","Punto",2014,500000);
		Car c2 = new Car("Porsche","Carrera GT",2005,1000000);
		Car c3 = new Car("Tata","Indica",2010,100000);
		
		Television t1 =  new Television("LG", "LCD", true, 10000);
		Television t2 =  new Television("Samsung", "LED", true, 15000);
		Television t3 =  new Television("Onida", "LED", true, 8000);
		
		CellPhone cp1 =  new CellPhone("Lenovo", "VIBE", "Android Phone", "Android 5", 8000);
		CellPhone cp2 =  new CellPhone("Xiaomi", "Mi5", "Android Phone", "Android 6", 10000);
		CellPhone cp3 =  new CellPhone("Lenovo", "VIBE", "Android Phone", "Android 5", 8000);
	}
}
