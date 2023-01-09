package Aggregation;

import Abstraction.Employee;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();
		c.setColor("Red");
		c.setPrice(5000000);
		c.setModel("Tesla");
		c.setCc(5000);
		
		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("Dummy Name");
		emp.setSalary(200000);
		emp.setPost("Engineer");
		emp.setCar(c);
		
		System.out.println("ID = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Post = "+emp.getPost());
		System.out.println("========== Car Info ==========");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Model = "+emp.getCar().getModel());
		System.out.println("Price = "+emp.getCar().getPrice());
		System.out.println("CC = "+emp.getCar().getCc());
	}
}
