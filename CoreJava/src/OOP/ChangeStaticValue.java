package OOP;

public class ChangeStaticValue {
	int rollno;
	String name;
	static String college = "TriChandra"; // Variable is created only once, regardless of number of object created.
	
	static void change() {
		college = "ASCOL";
	}
	
	ChangeStaticValue(int r, String n){
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		ChangeStaticValue s1 = new ChangeStaticValue(111, "Karan");
		ChangeStaticValue s2 = new ChangeStaticValue(222, "Aryan");
		s1.display();
		change();
		s2.display();
	}
}
	
