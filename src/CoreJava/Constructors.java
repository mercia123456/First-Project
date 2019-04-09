package CoreJava;

public class Constructors {
	String name;
	int age;
	
	public Constructors() {
		System.out.println("Default constructor");
	}
	public Constructors(int i) {
		System.out.println("constructor with one parameter");
		System.out.println(i);
	}
	public Constructors(int i, int j) {
		System.out.println("Constructor with 2 parameter");
		System.out.println(i+""+j);
		
	}
	public Constructors(String name, int age) {
		this .name = name;
		this.age = age;
		System.out.println(this.name);
	}
	
	public static void main(String[]args) {
		Constructors obj = new Constructors();
		Constructors obj1 = new Constructors(10);
		Constructors obj2 = new Constructors(10 ,20);
		Constructors obj3 = new Constructors("Sam",20);
		System.out.println(obj3.name+""+obj3.age);
	}

}
