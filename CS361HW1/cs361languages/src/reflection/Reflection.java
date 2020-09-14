/**
 * 
 */
package reflection;

/**
 * @author Sebastian Dabrowski
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null) {
			throw new IllegalArgumentException("Object passed is null");
		} else {
			Class currentClass = o.getClass();
		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
			System.out.println("Inheritance chain: ");
			System.out.print(currentClass.getName() + " inherits from ");
			while (currentClass.getSuperclass() != null && currentClass.getSuperclass() != Object.class) {
				currentClass = currentClass.getSuperclass();
				System.out.print(currentClass.getName() + " inherits from ");
			}
			System.out.println("java.lang.Object");
		}
		
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passed is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		for (Method method: m) {
			System.out.println(method.getName());
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an object of type String
		// TODO To complete
		r.inheritanceChain(new String());
		r.listMethods(new String());
		// Demonstration of the methods on an object of type ColoredCircle
		// TODO To complete	
		r.inheritanceChain(new ColoredCircle());
		r.listMethods(new ColoredCircle());
	}

}
