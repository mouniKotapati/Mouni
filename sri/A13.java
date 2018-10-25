package sri;

public class A13 {
	static int x=10;
	static void test() {
		x=40;
		A13.x=60;
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println("main:" + x);
		test();
		System.out.println("main end:" + x);
		// TODO Auto-generated method stub

	}

}
