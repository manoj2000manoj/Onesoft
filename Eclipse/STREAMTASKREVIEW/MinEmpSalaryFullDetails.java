package STREAMTASKREVIEW;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinEmpSalaryFullDetails {

	public static void main(String[] args) {
		Employee emp1=new Employee("Jeeva", 44000, "JavaDeveloper");
		Employee emp2=new Employee("Thiru", 35000, "Tester");
		Employee emp3=new Employee("Dinesh", 45000, "Front-end");
		List<Employee>details=Arrays.asList(emp1,emp2,emp3);
		//minSalaryOfEMployee
		System.out.println("Minimum Salary Of Employee Object---------->");
		Employee min=details.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(min);
		System.out.println();
		
		//Last Character Of employee Name using for loop
		System.out.println("Last Character of Employee Name----------->");
		for(int i=0;i<details.size();i++) {
			System.out.println(details.get(i).getName().charAt(details.get(i)
					.getName().length()-1));
		}
		System.out.println();
		
		//Second Max Salary
		System.out.println("Second Max Salary--------->");
		Integer secmax=details.stream().map(x->x.getSalary()).sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(secmax);
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