package STREAMTASK;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetailsHikeinJavaDeveloper {

	public static void main(String[] args) {
		Employee emp1=new Employee("Jeeva", 45000, "JavaDeveloper");
		Employee emp2=new Employee("Thiru", 35000, "Tester");
		Employee emp3=new Employee("Dinesh", 45000, "Front-end");
		ArrayList<Employee>details=new ArrayList<>();
		details.add(emp1);
		details.add(emp2);
		details.add(emp3);
		List<Employee>hike=details.stream().filter(x->x.getRole().equals("JavaDeveloper")).collect(Collectors.toList());
		hike.forEach(x->{
					x.setSalary(x.getSalary()+10000);
					System.out.println("JavaDeveloper Salary Hike will be:"+x.getSalary());
					System.out.println(x);
		});

	}
}
class Employee {
	private String name;
	private int salary;
	private String role;
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
	public Employee(String name, int salary, String role) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
}