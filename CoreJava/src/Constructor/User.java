package Constructor;

public class User {
	
	String username;
	String password;
	
	// Default constructor
	User(){
		username = "Admin";
		password = "Admin";
	}
	// Best practice, make a default constructor when making a parameterized constructor.
	
	// Parameterized construction
	/*
	User(String un, String psw){
		username = un;
		password = psw;
	}
	*/
	
	User(String username, String password){
		this.username = username;
		this.password = password;
		// 'this' keyword represents current object
	}
	
	// Same class can have multiple constructor, but must have different arguments in parameter. This is called constructor overloading.
	
	void print() {
		System.out.println("Username = "+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		// User u = new User();
		User u = new User("Name","Password");
		u.print();
	}
}
