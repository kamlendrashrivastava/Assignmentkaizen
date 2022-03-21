package kaizen_constructor;

public class Classroom {
	String student;
	String subject;
	int rollno;
	public Classroom() {
		System.out.println("room");
	}
    public Classroom(String student,String subject,int rollno) {
    	System.out.println("number");
         this.student=student;
         this.subject=subject;
         this.rollno=rollno;  
    }
    public static void main(String[] args) {
    Classroom teacher= new Classroom("mohit","maths",1245);
    teacher.describe();
    }
	public void describe() {
		System.out.println("Classroom [student=" + student + ", subject=" + subject + ", rollno=" + rollno + "]");
	}}
         
