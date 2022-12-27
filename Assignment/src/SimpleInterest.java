import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		float p,t,r,si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle ");
		p = sc.nextFloat();
		System.out.println("Enter time ");
		t = sc.nextFloat();
		System.out.println("Enter rate ");
		r = sc.nextFloat();
		if (p != 0 && t != 0 && r != 0) {
			si = (p*t*r)/100;
			System.out.println("Simple Interest is "+si);
		} else {
			System.out.println("Error, p, t, r = 0");
		}
		sc.close();
	}
}
