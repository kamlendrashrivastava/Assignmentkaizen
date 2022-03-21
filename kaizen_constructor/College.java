package kaizen_constructor;

public class College {
	String student;
	String name;
	int rollno;
	String dep;
	public College() {
		System.out.println("teach");
	}
    public College(String student,String name,int rollno, String dep) {
    	System.out.println("list");
         this.student=student;
         this.name=name;
         this.rollno=rollno; 
         this.dep=dep;
    }
    public static void main(String[] args) {
    	College president=new College();
    College pricipal= new College("computer","pradeep",1245,"mca");
    pricipal.describe();
    }
	public void describe() {
		System.out.println("College [student=" + student + ", name=" + name + ", rollno=" + rollno + ", dep=" + dep + "]");
	}

}
