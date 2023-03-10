package Method;

public class MethodTest {
	public static void main(String[] args) {
		sum();
		area(2,4);
		int sum = getSumOf1to100();
		System.out.println("Sum of 1 to 100 = "+sum);
		System.out.println("The smallest value = "+findSmallestValue(4,2));
	}
	
	// 1. No return type with no arguments
	
	static void sum() {
		int num1 = 1, num2 = 2, sum;
	  	sum = num1+num2;
	  	System.out.println("The sum is = "+sum);
	}
	
	// 2. No return type with arguments
	
	static void area(int l, int b) {
		int area = l*b;
		System.out.println("Area is = "+area);
	}
	
	// 3. Return type with no arguments
	
	static int getSumOf1to100() {
		int sum = 0;
		for(int i=1; i <= 100; i++) {
			sum = sum + i;
		}
		return sum;
	}
		
	// 4. Return type with arguments
	
	static int findSmallestValue(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
		
}
