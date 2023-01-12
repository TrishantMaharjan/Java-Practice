package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
				List<EmployeePojo> list = new LinkedList<>();
				Scanner sc = new Scanner(System.in);
				
				EmployeePojo em = new EmployeePojo();
				System.out.println("Enter employee id");
				em.setId(sc.nextInt());
				System.out.println("Enter employee name");
				em.setName(sc.next());
				System.out.println("Enter employee age");
				em.setAge(sc.nextInt());
				System.out.println("Enter employee salary");
				em.setSalary(sc.nextInt());
				
				list.add(em);
				
				for(EmployeePojo s : list) {
					System.out.println("Employee ID: "+s.getId());
					System.out.println("Employee Name: "+s.getName());
					System.out.println("Employee Age: "+s.getAge());
					System.out.println("Employee Salary: "+s.getSalary());
				}

				list.clear(); // Clears list
				
				sc.close();
	}
}
