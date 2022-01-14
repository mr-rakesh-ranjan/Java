package pa2;

class Employee {
	protected String name;
	protected int age;
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println(name + age);
	}
}

class Worker extends Employee{
	int hoursWorked;
	double salaryPerHour;
	Worker(String _name, int _age, int hoursWorked, double salaryPerHour ) {
		super("ram", 18);
		this.hoursWorked = hoursWorked;
		this.salaryPerHour = salaryPerHour;
	}
	public double cal_salary(double salaryPerHour, int hoursWorked) {
		return salaryPerHour * hoursWorked;
	}
	public void display() {
		System.out.println(hoursWorked +" " + salaryPerHour + " " + cal_salary(salaryPerHour, hoursWorked));
	}
}

class Manager extends Employee{
	String department;
	double salary;
	Manager(String name, int age, String department, double salary){
		super("ram", 18);
		this.department = department;
		this.salary = salary;
	}
	public void display() {
		System.out.println(department + " " + salary);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w = new Worker("ram", 21, 700, 7 );
		w.display();
		Manager m = new Manager("radha", 45, "worker", 45000);
		m.display();
	}

}
