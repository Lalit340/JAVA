class college {
	public static void main(String[] args) {
		
		//creating instence for an object LP
         
		  student s1=new student();
		  //initilization(storing) values of LP in s1 instance 

		  s1.sno        =101;
		  s1.sname   ="LP";
		  s1.course   ="core java";
		  s1.fee         =1000;


		  System.out.println("s1 instance is create and");
		  System.out.println("initilized with LP values");
		  
		  //creating another instance for an object SP

		  student s2 =new student();
		  //initilization (storing) values of SP in s2 instance


		   s2.sno        =102;
		   s2.sname   ="SP";
		   s2.course   ="advance java";
		   s2.fee         =1500;

		   System.out.println("\n s2 instance is create and" );
		   System.out.println("initilization with SP values" );
		   
		   System.out.println("\n s1 object values" );
		   System.out.println("s1.sno\t:"  + s1.sno);
		   System.out.println("s1.sname\t:"  + s1.sname);
		   System.out.println("s1.course\t:"  + s1.course);
		   System.out.println("s1.fee\t:"  + s1.fee);
		   
		   System.out.println("\n s2 object values");
		   System.out.println("s2.sno\t:" +s2.sno);
		   System.out.println("s2.sname\t:" +s2.sname);
		   System.out.println("s2.course\t:" +s2.course);
		   System.out.println("s2.fee\t:" +s2.fee);


	    }



}
