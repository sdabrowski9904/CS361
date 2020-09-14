/**
 * 
 */
package employee;

/**
 * @author Sebastian Dabrowski
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		// emp3.whoAmI() // prints PART TIME EMPLOYEE because emp3 is a reference to pEmp1 which is a PartTimeEmployee
		// emp3.getHourlyRate(); // returns syntax error because at compile time the compiler sees emp3 as
		// an Employee which does not have a getHourlyRate() method

		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3.getClass() == PartTimeEmployee.class) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		 //PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1; DONE
		// TODO To complete
		// This instruction does not compile
		// This instruction returns a ClassCastException at run time
		// because emp1 was created as an Employee and as a super class Employee cannot
		// be cast into its subclass PartTimeEmployee

		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
