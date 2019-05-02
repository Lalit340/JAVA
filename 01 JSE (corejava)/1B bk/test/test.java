public class test {
	int a=10;
	test(){
        System.out.println("non param");
        System.out.println(a);
	}
	test(double d){
        System.out.println("double param");
        System.out.println(d);
	}

     test(String s){
        System.out.println("String param");
        System.out.println(s);
	}
	public static void main(String[] args) {
		test t=new test();
		test t1=new test(5.0);
		test t2=new test("hi");

		System.out.println("Hello World!");
	}
}
