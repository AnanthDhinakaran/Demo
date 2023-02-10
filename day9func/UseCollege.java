package day9func;

public class UseCollege {
	public static void main (String[]args) {
		College c1 = new College();
		c1.name = "mcc";
		c1.fees= 7000;
		c1.grade= 'B';
		c1.location= "kanyakumari";
		
		College c2 = new College();
		c2.name = "rohini";
		c2.fees= 70000;
		c2.grade= 'C';
		c2.location= "nagercoil";
		
		College c3 = new College();
		c3.name = "cape";
		c3.fees= 80000;
		c3.grade= 'A';
		c3.location= "kottaram";
		
		College[] c = {c1,c2,c3};
		c1.maxFees(c);
		c1.minFees(c);
		
		
	}

}

class College {
	String name;
	int fees;
	char grade;
	String location;
	public void maxFees(College[] c){
		int max =c[0].fees;
		String n=c[0].name;
		for(int i = 0;i<c.length;i++) {
			if(max<c[i].fees) {
				max= c[i].fees;
				n=c[i].name;
			}
		}
		System.out.println(n+":"+max);
	}
		public void minFees(College[] c){
			int min =c[0].fees;
			String temp = "";
			for(College b: c) {
				if(b.fees<=min) {
					min = b.fees;
					temp =b.name;
				}
			}
			System.out.println(temp);
	}
}
