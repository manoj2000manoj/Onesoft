package task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetailsHikeinJavaDeveloper {
	public static void main(String[]args) {
		Employee E1=new Employee("Manoj",25000,"JavaDeveloper");
		Employee E2=new Employee("prathiban",35000,"JavaDeveloper");
		Employee E3=new Employee("Karthik",25000,"Tester");
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(E1);
		emp.add(E2);
		emp.add(E3);
		List<Employee>hike=emp.stream().filter(x->x.getRole().equals("JavaDeveloper")).collect(Collectors.toList());
		hike.forEach(x->{
			x.setSalary(x.getSalary()+10000);
			System.out.println(x);
			System.out.println(x.getSalary());
			
		});
	}

}
class Employee {
	private String name;
	private int salary;
	private String role;
	public Employee(String name, int salary, String role) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
