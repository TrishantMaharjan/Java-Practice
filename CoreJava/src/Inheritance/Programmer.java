package Inheritance;

public class Programmer extends Employee {
	
	String progLang;
	String project;
	int bonus;
	
	void print() {
		super.print(); // Calls print from parent class. If only print() is used, calls itself, gives stackoverflow error, ie. heap space is full.
		
		System.out.println("Programming Language = "+progLang);
		System.out.println("Project = "+project);
		System.out.println("Bonus = "+bonus);
	}
	
	public static void main(String[] args) {
		
		Programmer pg = new Programmer();
		
		pg.id = 220;
		pg.name = "Dummy Name";
		pg.salary = 70000;
		pg.bonus = 20000;
		pg.progLang = "Java";
		pg.age = 24;
		pg.project = "EMS";
		
		pg.print();
	}
}
