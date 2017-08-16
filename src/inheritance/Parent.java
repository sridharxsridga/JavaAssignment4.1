/*
 * This class is to demonstrate Inheritance 
 * 
 */

package inheritance;

public class Parent {

	private void method1() {
		System.out.println("Parents Method 1");
	}

	private void method2() {
		System.out.println("Parents Method 2");
		method1();
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		
	}
}
