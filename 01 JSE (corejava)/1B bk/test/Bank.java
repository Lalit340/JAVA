public class  Bank {
	static  String BankName ;
	static   String IFSC        ;
                String Location  ;
      static {
            BankName ="SBI";
             IFSC          ="SBI00N0151";
	   }
       void  SBank(){
           	System.out.println("No custemer present");
	   }
	    void  Location(String loc){
		   Location=loc ;
          System.out.println(Location);
	   }
	   
	
}
