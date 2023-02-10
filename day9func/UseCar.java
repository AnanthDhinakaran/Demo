package day9func;

public class UseCar {
	public static void main (String[]args) {
		Car c1 = new Car();
		c1.brand = "swift";
		c1.price= 700000;
		c1.color="yellow";
		
		Car c2 = new Car();
		c2.brand = "bmw";
		c2.price= 900000;
		c2.color="black";
		
		System.out.println(c2.min(c1,c2));
		
	}

}

class Car {
	String brand;
	int price;
	String color;
	public int min (Car c1,Car c2) {
		//int a = 0;
		if(c1.price<c2.price) {
			//System.out.println(c2.price+" is minimum");
			return c1.price;
			}
		else {
			//System.out.println(c1.price+" is max");
			return c2.price;
		}
	}
}