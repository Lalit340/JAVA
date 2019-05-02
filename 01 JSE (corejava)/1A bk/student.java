import static java.lang.System.*;
public class  student {
	 private static String instituteName;
	 private static int count ;

	 private int sno;
	 private String sname;
	 private String course;
	 private double fees;

	 static {
          instituteName ="NARESH I TECHNOLOGY";
		  count  = 0;

		  out.println("initialized static variables");
		  out.println("class is ready to execute");
	}
    {
        out.println("instance is created");
        out.println("NSV is initialized with default values");
		count++;
		out.println("object count is created");
    }
    public student() {
	out.println("object is not Initialized with any explicit values");
	out.println("object has only default values");
	out.println("object constuction is completed");

    }
	public  student(int sno,String sname,String course,double fees) {

		this.sno        = sno;
		this.sname  =sname;
		this.course  =course;
		this.fees       =fees;
        out.println("Initialized object values");
		out.println("object constuction is completed");
	}
	public static void setInstituteName(String instituteName){
		student.instituteName =instituteName;
    }
	public String getInstituteName(){
		return instituteName;
	}
	public void setSno(int sno){
		this.sno=sno;
    }
	public int getSno(){
		return sno;
    }
    public void setSname(String sname){
		this.sname=sname;
    }
	public String getSname(){
		return sname;
    }
	public void setCourse(String course){
		this.course=course;
    }
	public String getCourse(){
		return course;
    }
	public void setFees(double fees){
		this.fees=fees;
    }
	public double getFees(){
		return fees;
    }
	public void display(){
		out.println("institute :"+instituteName);
		out.println("count :"+count);
		out.println("sno :"+ sno);
		out.println("sname :"+ sname);
		out.println("course :"+ course);
		out.println("fees :"+ fees);
	}
}
