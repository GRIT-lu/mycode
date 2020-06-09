package ray;

public class Student {
	int id;
	String name;
	int age;
	
	Computer comp;
	
	void study() {
		System.out.println("working hand!"+comp.brand);
	}
	
	void play() {
		System.out.println("I'm playing!");
	}

	public static void main(String args[]) {
		Student stu = new Student();
		stu.play();
		stu.id=123;
		stu.name="Alsion";
		
		Computer a = new Computer();
		a.brand="lenovo";
		
		stu.comp=a;
		
		stu.study();
		
		
	}
}

class Computer{
	String brand;
}
