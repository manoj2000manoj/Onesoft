package functionsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAge {
	public static void main(String[]args) {
		Employee E1=new Employee("manoj",24,111);
		Employee E2=new Employee("karthik",29,112);
		Employee E3=new Employee("prathiban",26,113);
		Employee E4=new Employee("poovarasan",27,114);
		ArrayList<Employee>emp=new ArrayList<>();
		emp.add(E1);
		emp.add(E2);
		emp.add(E3);
		emp.add(E4);
		List<Employee>emps=Arrays.asList(E1,E2,E3,E4);
		Age a=new Age();
		
		System.out.println(a.findRange(emps,25,35));
		
	}

}
class Age {
	public List<Employee>findRange(List<Employee>emps,int minAge,int maxAge){
		return emps.stream().filter(x->x.getAge()>minAge&&x.getAge()<maxAge).toList();
	}
}
class Employee {
	private String name;
	private int age;
	private int id;
	public Employee(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String toString() {
		return "EmployeeName=" + name + ", age=" + age + ", id=" + id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}