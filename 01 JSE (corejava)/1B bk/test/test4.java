class test4 {
	static int a=test4.foo();
	static int foo(){
     System.out.println(a);
     return 10+test4.a;
	}
	public static void main(String[] args) 	{
	             test4.foo();
	    	System.out.println(test4.foo()+a);
	}
}
