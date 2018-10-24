
 class M {
  static int i;
  static
  {
	  System.out.println("M.SIB");
  }

	}

class M1
{
	static
	{
		System.out.println("M1.SIB");	
	}
	public static void main(String[] args) {
		System.out.println("Main begin");
		System.out.println(M.i);
		System.out.println("Main end");
	}
}
