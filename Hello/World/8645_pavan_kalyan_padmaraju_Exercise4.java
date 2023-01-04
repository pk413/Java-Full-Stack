package Hello.World;

class Employee {
	// static variable
	public static double salary;
	public static String Emp_Id = "Tango";
}

public class Hello_World {
	public static void main(String[] args) {
		Employee.salary= 539874.5367;
		System.out.println(Employee.Emp_Id + "'s annual salary : " + Employee.salary);
	}
}