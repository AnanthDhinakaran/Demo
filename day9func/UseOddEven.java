package day9func;

public class UseOddEven {
	public static void main(String[]args) {
		OddEven o1= new OddEven();
		System.out.println(o1.OddEven(9));
		
	}

}

class OddEven {
	public String OddEven(int a) {
		if(a%2==0) {
			return "yes it is even";
		}
		else {
			return "no it is odd";
		}
	}
}
