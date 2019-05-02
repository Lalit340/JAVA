class  testB6 extends testA6{
	 static int a=15;
	 double d=25;
	  static void m1(){
		  
             System.out.println("testB  static method");
	}
	void m2(){
		m2("hi");
		System.out.println("testB overriding method");
	}
private 	void m2(String s){
		System.out.println("String  param");
		System.out.println(s);
		
	}

	public static void main(String[] args) 	{
            testB6 t=new testB6();
			testA6  t2=t;
		
			t2.m2();
			t2.m2(5.0f);
			t2.m2(40);
			t2.m2('a');

		System.out.println(a);
		System.out.println(t2.a);
		System.out.println(t.d);
		System.out.println(t2.d);
	}
}
