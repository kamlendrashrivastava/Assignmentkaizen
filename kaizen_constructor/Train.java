package kaizen_constructor;

public class Train {
	String name;
	int age;
	int birthno;
	String gender;
	public Train() {
		System.out.println("room");
	}
    public Train(String name,int age,int birthno, String gender) {
    	System.out.println("Type");
         this.name=name;
         this.age=age;
         this.birthno=birthno; 
         this.gender=gender;
    }
    public static void main(String[] args) {
    Train ticket=new Train();
    Train booking= new Train("mohit",25,22,"male");
    booking.describe();
    }
	public void describe() {
		System.out.println("Train [name=" + name + ", age=" + age + ", birthno=" + birthno + ", gender=" + gender + "]");
	}

}
