package day9func;

public class UseMarks {
	public static void main(String[]args) {
		Marks m = new Marks();
		m.displayMarks(80,90,70);
		m.findTotal(80, 90, 70);
		
	}
}


class Marks {
	public void displayMarks(int tamil, int english, int maths) {
		System.out.println(tamil+" "+english+" "+maths);
		}
	public void findTotal(int tamil,int english,int maths) {
		System.out.println(tamil+english+maths);
	}
}