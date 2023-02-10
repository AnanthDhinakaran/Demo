package day9func;

public class UseBike {
	public static void main(String[]args) {
		Bike b1 = new Bike();
		String[]a = {"ananth","subathra","thaya"};
		b1.bike(a);
		
	}

}
class Bike {
	public void bike(String[]a) {
		String lon = "";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>lon.length()) {
				lon = a[i];
				
			}
		}
		System.out.print(lon);
		
		
	}
		
	
}
