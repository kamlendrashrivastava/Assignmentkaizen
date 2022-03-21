package kaizen_constructor;

public class Animal {
	String name;
	String type;
	String colour;
	public Animal() {
		System.out.println("test1");
	}
	public Animal(String name, String type, String colour) {
		System.out.println("test2");
		this.name=name;
		this.type=type;
		this.colour=colour;
	}
	public static void main(String[] args) {
		Animal pets=new Animal();
		Animal pet= new Animal("Cat","pet","balck");
		pet.describe();
		}
	public void describe() {
		System.out.println("Animal [name=" + name + ", type=" + type + ", colour=" + colour + "]");
	}
		

}
