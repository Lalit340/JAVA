class test16 {
	int a=10;
	
	{
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(this.b);
	}
	public static void main(String[] args) {
		System.out.println("main");
		test16 t =new test16();
		System.out.println(t.a);
		System.out.println(t.b);
		}
   int b=20;	

}
