package ray;

public class Student {
	int id;
	String name;
	int age;
	
	Computer comp;
	
	void study() {
		System.out.println("����ѧϰ"+comp.brand);
	}
	
	void play() {
		System.out.println("�������");
	}

	public static void main(String args[]) {
		Student stu = new Student();
		stu.play();
		stu.id=123;
		stu.name="Alsion";
		
		Computer a = new Computer();
		a.brand="����";
		
		stu.comp=a;
		
		stu.study();
		
		
	}
}

class Computer{
	String brand;
}
