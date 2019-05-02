class bankAccount {
	static String bName;
	static String branchName;
	static String ifsc;

    private	long accNum;
    private	String accHname;
    private	double balance;

    static {
		bName ="SBI";
		branchName="AMEERPET";
		ifsc    ="SBI00N00151";

		System.out.println("BANKACCOUNT CLASS IS LOADED");
		System.out.println("SVs MEMORY ALLOCATED");
		System.out.println("SB IS EXECUTED AND ALL SVs ARE INITIALIZED \n");
	}
	public bankAccount(long accNum,String accHname, double balance){
		this.accNum  =accNum ;
		this.accHname  =accHname ;
		this.balance  =balance ;
		System.out.println("BA object is created and \n initialized with the passed values");

	}
	public void deposite(double amt){
		this.balance=this.balance+amt ;
    }
    public double withdraw (double amt) {
		this.balance=this.balance - amt ;
        return amt ;   
	}
	public void currentBalance(){
		System.out.println("currentBalance :"+this.balance);
    }
     public void bankName(){
		System.out.println("bankName :"+bName);
    } 
    public void branchName(){
		System.out.println("branchName:"+branchName);
    }
    public void IFSC(){
		System.out.println("IFSC:"+ifsc);
    }
	public void Display(){
		System.out.println("bank name :"+bName);
		System.out.println("branchNAME :"+branchName);
		System.out.println("IFSC :"+ifsc);
		System.out.println("accNo :"+this.accNum);
		System.out.println("accHname :"+this.accHname);
		System.out.println("balance :"+this.balance);

	}

}
