package OOP;

public class StaticVariable {
	
	int rollno;
	String name;
	static String college = "ITS"; // Variable is created only once, regardless of number of object created.
	
	StaticVariable(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		StaticVariable s1 = new StaticVariable(111, "Karan");
		StaticVariable s2 = new StaticVariable(222, "Aryan");
		s1.display();
		s2.display();
	}
}
