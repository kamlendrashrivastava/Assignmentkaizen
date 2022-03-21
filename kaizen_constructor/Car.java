package kaizen_constructor;
public class Car {
	String name;
	String model;
	String colour;
	public Car() {
		System.out.println("test");
	}
	public Car(String name, String model, String colour) {
		System.out.println("test2");
		this.name=name;
		this.model=model;
		this.colour=colour;
	}
	public static void main(String[] args) {
		Car c1= new Car("nissan","activa","honda");
		c1.describe();
		}
		
	
	public void describe() {
	System.out.println("Car [name=" + name + ", model=" + model + ", colour=" + colour + "]");

		
	}
	
}


