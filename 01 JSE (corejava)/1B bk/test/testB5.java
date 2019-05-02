class  testB5 extends testA5{
	public static void main(String[] args) {
		testA5 t=new testB5();
    	t.setString("hi");
         System.out.println(t.a);
         System.out.println(t.c);
         System.out.println(t.l);
         System.out.println(t.getString());
		
	}
}
