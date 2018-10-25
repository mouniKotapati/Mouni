package sri;

public class A15 {
	static int x=10;
	static void test() {
		x=20;
	}
	  
	public static void main(String[] args) {
		System.out.println("main:" + x);
		test();
		System.out.println("main end:" + x);
		// TODO Auto-generated method stub

	}

}
