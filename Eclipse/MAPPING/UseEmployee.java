package MAPPING;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("jeeva", 24, 300000, true, 3.0f,"Devloper,");
		Employee e2 = new Employee("dinesh", 20, 40000, false, 2.0f,"CyberSecurity");
		Employee e3 = new Employee("poovu", 25, 50000, true, 6.0f,"fullstack");
		Employee e4 = new Employee("karthi", 30, 40000, true, 4.5f,"Database");
		Employee e5 = new Employee("vino", 23, 40000, false, 1.5f,"Human resource");
		HashMap<Integer, Employee> emp=new HashMap<>();
		emp.put(e1.getAge(),e1);
		emp.put(e2.getAge(),e2);
		emp.put(e3.getAge(),e3);
		emp.put(e4.getAge(),e4);
		emp.put(e5.getAge(),e5);
		System.out.println(emp);
		//for each loops
		System.out.println("------------Print the key and value-----");
		emp.forEach((x,y)->{
			System.out.println(x+" "+y);
		});
		System.out.println("------------print the name only---------");
		emp.values().forEach(x->
			{System.out.println(x.getName());}
		);

		//Enhanced for loops
		System.out.println();
		System.out.println("------------Print the key and value--------");
		for(Object x:emp.keySet()) {
			System.out.println(x+" "+emp.get(x));
		}
		System.out.println();
		System.out.println("--------print only male employee----------");
		for(Employee x:emp.values()) {
			if(x.getisMale()==true)
				System.out.println(x);
		}
		
		//max finding
		System.out.println();
		System.out.println("------------Maximum salary------------");
		Employee max=e1;
		for(Employee x:emp.values()) {
			if(x.getSalary()>max.getSalary()) {
				max=x;
			}
		}
		System.out.println(max);
		System.out.println();
		System.out.println("---------Maximum of Experience-----------");
		Employee maxExp=e1;
		for(Integer x:emp.keySet()) {
			if(emp.get(x).getExp()>maxExp.getExp()) {
				maxExp=emp.get(x);
			}
		}
		System.out.println(maxExp);
		System.out.println();
		System.out.println("----------Experience more than 3 salary will 2000 hike------");
		for(Employee x:emp.values()) {
			if(x.getExp()>3)
				x.setSalary(x.getSalary()+2000);
		}
		System.out.println(emp);
		System.out.println();
		System.out.println("----------if age more than 24 print our name using keyset----");
		for(Integer x:emp.keySet()) {
			if(emp.get(x).getAge()>24) {
				System.out.println(emp.get(x).getName()+"==This person age is Greater than 24");
			}
		}
		
		System.out.println("-----------Using ITERATOR methoads-------");
		System.out.println();
		Iterator<Employee>e=emp.values().iterator();
		while(e.hasNext()) {
			if(e.next().getAge()>20) {
				e.remove();
			}
		}
		System.out.println(emp.values());
		
		

	}

}
class Employee {
	private String name;
	private int age;
	private int salary;
	private boolean isMale;
	private float exp;
	private String role;

	public Employee(String name, int age, int salary, boolean isMale, float exp, String role) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isMale = isMale;
		this.exp = exp;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean getisMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public float getExp() {
		return exp;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", isMale=" + isMale + ", exp=" + exp
				+ ", role=" + role + "]";
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	
}