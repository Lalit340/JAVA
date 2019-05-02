class test1 {
	void m1(foo f){
		System.out.println("foo param");
	}
   void m1(alpha p){
		System.out.println("alpha param");
	}
	public static void main(String[] args) {
		test1 t=new test1();
		t.m1(new Beta());

	 t.m1(null);
	
	}
}
