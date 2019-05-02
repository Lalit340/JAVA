class  test18{
       public static void main(String[] args) {
		System.out.println("main started");
		test18 t =new test18();
		System.out.println("object created ");
		t.m1();
		System.out.println("main end ");
	}
	int x =m1();
	int m1(){
		System.out.println("NSV x");
		System.out.println("end of m1");
		return 20;
    }
	{
		System.out.println("NSB started");
		System.out.println("NSB ended");
	}
	test18() {
          System.out.println("constructor started");
          test18 t =new test18();
          System.out.println("constructor ended");
	} 
}
