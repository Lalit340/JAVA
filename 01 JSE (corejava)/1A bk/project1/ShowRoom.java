class  ShowRoom {
	public static void main(String[] args) {

          Bike b1 = new  Bike(); 
          Bike b2 = new Bike();
		  
		  b1.engNo        ="xy456hk";
		  b1.colour        ="black";
		  b1.ownerName       ="HK";
		  b1.bikNo        ="TS09 P 4013";
		  b1.brand        ="bajaj";
		  //System.out.println("HK values are stored in instance");

          b2.engNo        ="xy457hk";
		  b2.colour        ="RED";
		  b2.ownerName       ="BK";
		  b2.bikNo        ="TS09 P 333";
		  b2.brand        ="bullet";
		  //System.out.println("BK values are stored in instance");
		  
          System.out.println("\nHK values are");
		  System.out.println( b1.engNo );
		  System.out.println(b1.colour);
		  System.out.println(b1.ownerName );
		  System.out.println( b1.bikNo);
		  System.out.println(b1.brand);
	
          System.out.println("\nBK values are");
		  System.out.println( b2.engNo );
		  System.out.println(b2.colour);
		  System.out.println(b2.ownerName );
		  System.out.println( b2.bikNo);
		  System.out.println(b2.brand);
	

	}
}
