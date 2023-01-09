package Abstraction;

public class UserServiceImpl extends Dummy implements UserService, CommonService{ // Can have Extends and Implements at once, with extends having higher priority.
	private static final long serialVersionUID = 1L;
	@Override
	public void addUser() {
		System.out.println("Added Success");
	}
	@Override
	public void deleteUser() {
		System.out.println("Deletion Success");
	}
	@Override
	public void print() {
		System.out.println("Message Print");
	}
}
