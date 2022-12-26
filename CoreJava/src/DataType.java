
public class DataType {
	/*
	 * ========== Data Type ==========
	 * 1. Proper data representation
	 * 2. Proper memory allocation
	 * 3. Proper operation to be perform
	 * 
	 * Types:
	 * 1. Primitive
	 * 	a. Byte
	 * 	b. Short
	 * 	C. Int (Default)
	 * 	d. Long
	 * 	e. Float
	 * 	f. Double (Default)
	 * 	g. Char
	 * 	h. Boolean
	 * 2. Non-Primitive
	 * 	a. String
	 * 	b. Array
	 * 	c. Classes
	 * 	d. Collection
	 */
	
	public static void main(String[] args) {
		/*
			int a = 700;
			long b = 6000000000l;
			double c = 2.565335435;
			float d = 2.5f;
		*/
		System.out.println("Byte = "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("Short = "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
		System.out.println("Int = "+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		System.out.println("Long = "+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
		System.out.println("Float = "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
		System.out.println("Double = "+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
		System.out.println("Char = "+Character.SIZE);
	}
}
