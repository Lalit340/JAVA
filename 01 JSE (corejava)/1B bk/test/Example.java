class Example {
	 int a;
	 String s;
	 Example(int x){
           System.out.println(x);
	 }
	 	 Example(int a, String s){
			 this(100);
			 this.a=a;
			 this.s=s;
			this.m1();
           System.out.println(a);
           System.out.println(s);
	 }
	 void m1(){
             System.out.println(a);
	 }
	public static void main(String[] args) {
	
    Example e=new Example(20 , "HI");
		
	}
}
