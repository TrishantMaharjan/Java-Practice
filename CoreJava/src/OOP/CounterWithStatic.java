package OOP;

public class CounterWithStatic {
	static int count = 0; // Will get memory only once and retain it's value
	
	CounterWithStatic(){
		count++;
	}
	
	private void showCount() {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new CounterWithStatic().showCount();
		new CounterWithStatic().showCount();
		new CounterWithStatic().showCount();
	}
}
