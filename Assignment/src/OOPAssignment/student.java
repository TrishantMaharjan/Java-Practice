package OOPAssignment;

/*
 * Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
 * Assign the value of roll_no as '2' and that of name as "John" by creating an object of the 
 * class Student.
 */

public class student {
	
	String name;
	int roll_no;
	
	void assign() {
		name = "John";
		roll_no = 2;
	}
	
	void display() {
		System.out.println("The student's name is "+name+". \nAnd his roll no is "+roll_no);
	}
	
	public static void main(String[] args) {
		student st = new student();
		st.assign();
		st.display();
	}
}
