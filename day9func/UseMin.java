package day9func;

public class UseMin {
	public static void main(String[]args ) {
		Min m = new Min();
		int[]a= {8,9,6};
		m.min(a);
		
	}

}

class Min {
	public void min (int[]a) {
		int s= a[0];
		for(int i =0;i<a.length;i++) {
			if(a[0]>a[i]) {
		        s=a[i];
		        
			}
			
		}
		System.out.println(s);
		
	}
}
