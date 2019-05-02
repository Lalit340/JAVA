class  test19 {
   {
		System.out.println("SB");
	   test19 a = new test19();
    }
	test19() {
		System.out.println("constructor start");
	}
	public static void main(String[] args) 	{

		System.out.println("main start");
		test19 a = new test19();
	}
}
