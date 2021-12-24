//Initialization of object through using constructors

package objectOrientedProgramming;

public class Employee {
	String name;
	int empId;
	Employee(String name, int empId){
		this.name = name;
		this.empId = empId;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee("nazim", 1009);
		System.out.println(E1.name + " " + E1.empId);
	}

}
