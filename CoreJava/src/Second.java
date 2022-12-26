/* 
 * Main method is used for run time only, sought by JVM, not in compile time by javac.
 */
public /* predefined/key word */ class Second /* Identifier */ {
	/* ;, {, }, etc is delimiter */
	/* public, private, protected are access modifiers */
	/*
	 * 1) public - access everywhere. eg. public int a;
	 * 2) protected - access in class, same package (CoreJava), child class in different package. eg protected int a;
	 * 3) default (package private) - access in class and same package. eg. int a;
	 * 4) private - access in class only. eg. private int a;
	 */
	public static /* efficient memory management */ void /* return type */ main(String[] /* data type */ args /* variable */) {
		System.out.println("Hello"); /* System - Computer, out - monitor/output, println - print new line */
	/* 
	 * Main is used by JVM, which doesn't have any self processing. This is why the return type is void.  
	 */
	}
}
