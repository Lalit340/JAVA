class company {
	public static void main(String[] args){
    employee.companyName ="TCS";

    employee e1 = new employee();
	
	e1.empId        =143;
	e1.eName       ="HK";
	e1.department          ="MANAGER";
	e1.salary         =10500;
	e1.addr    =new  address();
	e1.addr.pin     =74561;
	e1.addr.city    ="HYD";
	e1.addr.state  ="TS";
    e1.lapy   = new Laptop();
	e1.lapy.serialNo   =5000;
	e1.lapy.brand       ="DELL";
	e1.lapy.processor ="I5";
	e1.lapy.price         =56000;
    
	employee e2 = new employee();
	
	e2.empId        =154;
	e2.eName       ="BK";
	e2.department          ="DBA";
	e2.salary         =12500;
	e2.addr    =new  address();
	e2.addr.pin     =74571;
	e2.addr.city    ="SEC";
	e2.addr.state  ="TS";
	e2.lapy   = new Laptop();
	e2.lapy.serialNo   =3000;
	e2.lapy.brand       ="LENOVO";
	e2.lapy.processor ="I5";
	e2.lapy.price         =50999;
		
		System.out.println("HK employee values are ");
		System.out.println("e1.companyName:\t " +e1.companyName);
		System.out.println("e1.empId :\t" +e1.empId );
		System.out.println("	e1.eName:\t" + e1.eName);
		System.out.println("e1.department	:\t" +e1.department);
		System.out.println("e1.salary 	:\t" +e1.salary );
		System.out.println("e1.addr.pin	:\t" +e1.addr.pin );
		System.out.println("e1.addr.city	:\t" +e1.addr.city );
		System.out.println("e1.addr.state	:\t" +e1.addr.state);
		System.out.println("e1.lapy.serialNo	:\t" +e1.lapy.serialNo);
		System.out.println("e1.lapy.brand 	:\t" +e1.lapy.brand );
		System.out.println("e1.lapy.processor 	:\t" +e1.lapy.processor );
		System.out.println("e1.lapy.price	:\t" +e1.lapy.price );
        
		
		System.out.println("BK employee values are ");
		System.out.println("e2.companyName:\t " +e2.companyName);
		System.out.println("e2.empId :\t" +e2.empId );
		System.out.println("	e2.eName:\t" + e2.eName);
		System.out.println("e2.department	:\t" +e2.department);
		System.out.println("e2.salary 	:\t" +e2.salary );
		System.out.println("e2.addr.pin	:\t" +e2.addr.pin );
		System.out.println("e2.addr.city	:\t" +e2.addr.city );
		System.out.println("e2.addr.state	:\t" +e2.addr.state);
		System.out.println("e2.lapy.serialNo	:\t" +e2.lapy.serialNo);
		System.out.println("e2.lapy.brand 	:\t" +e2.lapy.brand );
		System.out.println("e2.lapy.processor 	:\t" +e1.lapy.processor );
		System.out.println("e2.lapy.price	:\t" +e2.lapy.price );

	}
}
