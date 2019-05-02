import java.io.File;
import java.io.FileNotFoundException;
import java.Util.Scanner;
public class  Bike{
	private static String brand;
	private static int wheel;
	private static int count;

	private String engNo;
	private String colour;
	private String ownerName;
	private String bikNum;

	static {
          System.out.println("class is loaded");
		  try{
			Scanner scn =new Scanner(new file("companyDetails.txt"));
			brand =scn.nextLine();
			wheel =2;
          }
		  catch (FileNotFoundException e) {
			  e.printstacktrace();
		  }
		{
			count++;
        }
		public bike(String engNo , String colour){
			if (brand==null) {
				throws new runtime exception("companyDetails.txt are not found); 
			}
			this.engNo =engNo;
			this.colour =colour;
			 System.out.println("engNo and colour is initialized");
		}
		public String getengNo(){
			return this.engNo;
        }
			public String getColour(){
			return this.colour;
        }
		public void setOwnerName(String ownerName){
			this.ownerName=ownerName;
        }
			public String getOwnerName(){
			return this.ownerName;
        }
        	public void setBikeNum(String bikNum){
			this.bikNum=bikNum;
			}

		   public String getBikeNum(){
			return this.bikNum;
			}
			public void start(){
				System.out.println(this.ownerName+"started bike :"+this.bikNum);
            }
            public void move(){
				System.out.println(this.ownerName+"moved bike :"+this.bikNum);
            }
			public void stop(){
				System.out.println(this.ownerName+"stoped bike :"+this.bikNum);
			}
			public static void getCount(){
				return count;
			}
			public void display(){
		  System.out.println("BRAND :"+brand);
		  System.out.println("wheel :"+wheel);
		  System.out.println("engNo :"+ this.engNo);
		  System.out.println("	colour :"+this.colour);
		  System.out.println("ownerName:"+this.ownerName);
		  System.out.println("BikeNum:"+this.bikNum);
	}
}
