package ray;

public class Student {
	int id;
	String name;
	int age;
	
	Computer comp;
	
	void study() {
		System.out.println("认真学习"+comp.brand);
	}
	
	void play() {
		System.out.println("我在玩儿");
	}

	public static void main(String args[]) {
		Student stu = new Student();
		stu.play();
		stu.id=123;
		stu.name="Alsion";
		
		Computer a = new Computer();
		a.brand="联想";
		
		stu.comp=a;
		
		stu.study();
		
		
	}
}

class Computer{
	String brand;
}
