package STREAMTASK;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NoOfEmpParticularDept {

	public static void main(String[] args) {
		Emp emp1=new Emp("IT", "Jeeva",40000,23);
		Emp emp2=new Emp("IT", "karthik",45000,3);
		Emp emp3=new Emp("IT", "poovu",43000,27);
		Emp emp4=new Emp("IT", "manoj",40000,24);
		Emp emp5=new Emp("NON-IT", "Thiru",25000,23);
		Emp emp6=new Emp("NON-IT", "Dinesh",18000,23);
		Emp emp7=new Emp("Self-emp", "Subash",20000,23);
		Emp emp8=new Emp("Self-emp", "Tamil",40000,29);
		List<Emp>emp=Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8);
		Long count=emp.stream().filter(x->x.getDept()=="NON-IT").count();
		System.out.println("Number of Emp in IT Dept: "+count);
		
		String sorting=emp.stream()
				.filter(x->x.getSalary()>=25000)
				.sorted(Comparator.comparing(Emp::getName).reversed())
				.sorted(Comparator.comparing(Emp::getAge).reversed())
				.map(x->x.getName()+""+x.getAge())
				.findFirst().get();
		System.out.println(sorting);

	}
 
}

class Emp {
	private String Dept;
	private String name;
	private int salary;
	private int age;
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Emp(String dept, String name, int salary, int age) {
		super();
		Dept = dept;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [Dept=" + Dept + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
}