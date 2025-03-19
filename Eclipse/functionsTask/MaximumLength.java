package functionsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumLength {
	public static void main(String[]args) {
		Employ E1=new Employ("manoj",24,111);
		Employ E2=new Employ("karthik",29,112);
		Employ E3=new Employ("prathiban",26,113);
		Employ E4=new Employ("poovarasan",27,114);
		ArrayList<Employ>emp=new ArrayList<>();
		emp.add(E1);
		emp.add(E2);
		emp.add(E3);
		emp.add(E4);
		List<Employ>emps=Arrays.asList(E1,E2,E3,E4);
		System.out.println(emp.findName(emps));
		
	}

}
class Name {
	public List<Employ>findName(List<Employ>emps){
		return emps.stream().max(Comparator.comparingInt(Employ.getName().length()).get())
	}
}
class Employ {
	String name;
	int age;
	int id;
	public Employ(String name, int age, int id) {
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
