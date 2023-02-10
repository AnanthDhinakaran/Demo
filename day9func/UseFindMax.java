package day9func;

public class UseFindMax {
	public static void main(String[]args) {
		FindMax f1=  new FindMax();
		f1.findMax(2,3,4);
		
	}

}

class FindMax{
	public void findMax(int a, int b, int c) {
		if(a>b && a>c) {
		System.out.println(a +" is max");
		}
		if(b>a && b>c) {
		System.out.println(b +" is max");
		}
	    if(c>a && c>b) {
		System.out.println(c +" is max");
	    }
		
	}
}