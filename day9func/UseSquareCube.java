package day9func;

public class UseSquareCube {
	public static void main(String[]args) {
		SquareCube s1 = new SquareCube();
		System.out.println(s1.square(2));
		System.out.println(s1.cube(2));
		
	}

}

class SquareCube {
	public int square(int a) {
		return a*a;
	}
	public int cube (int a) {
		return a*a*a;
	}
}
