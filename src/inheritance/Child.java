/*
The outcome must be one of the following:
A. Compile-time error
B. Run-time error
C. Prints : Parent's method2()
Parent's method1()
D. Prints : Parent's method2()
Child's method1()

Answer: A , Compile time Error , since method2 of Parent class is private

*/
package inheritance;

public class Child extends Parent {

	private void method1() {
		System.out.println("Child Method 1");
	}
	public static void main(String[] args) {
		Parent p = new Child();
		p.method2();  //Error since method2 of Parent class is private
	}
}
