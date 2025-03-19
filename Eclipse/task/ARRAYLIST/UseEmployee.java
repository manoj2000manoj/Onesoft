package ARRAYLIST;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("jeeva", 24, 300000, true, 3.0f);
		Employee e2 = new Employee("sharmi", 20, 40000, false, 2.0f);
		Employee e3 = new Employee("poovu", 25, 50000, true, 4.0f);
		Employee e4 = new Employee("karthi", 30, 40000, true, 4.5f);
		Employee e5 = new Employee("vino", 24, 40000, false, 1.5f);
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		//System.out.println(emp);
//		System.out.println(emp.get(0));
//		System.out.println(emp.get(0).getName()+"\n"+emp.get(1).getName());
//		for (int i = 0; i < emp.size(); i++) {
//			// System.out.println(emp.get(i).getName());
//			if (emp.get(i).getAge() > 26) {
//				System.out.println(emp.get(i));
//			}
		 //System.out.println(emp.get(i));
	//}
		//if salary more than 40000 discount 2000
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getSalary()>=40000) {
				emp.get(i).setSalary(emp.get(i).getSalary()-2000);
			}
				
		}
		
		
		// Enchanced for------------------------------>
//		for (Employee x : emp) {
//			// System.out.println(emp);
//			if (x.getAge() >= 25) {
//				System.out.println(x);
//			}
//		}
		//experience more than 2years salary 10%hike;
//		for(Employee x : emp) {
//			if(x.getExp()>2) {
//				x.setSalary(x.getSalary()+x.getSalary()*10/100);
//				System.out.println(x);
//			}	
//		} 
		
//		Employee max=emp.get(0);
//		for(Employee x : emp) {
//			if(x.getSalary()>max.getSalary()) {
//				max=x;
//			}
//		}
//		System.out.println(max);
		// for-each loop------------------------------>
		//if age is more than 25 print all the value
//		emp.forEach(x -> {
//			if (x.getAge() >= 25)
//				System.out.println(x);
//		});
		//experience more than 2years salary 10%hike; using for-each loops
//		emp.forEach(x->{
//			if(x.getExp()>2) {
//				x.setSalary(x.getSalary()+x.getSalary()*10/100);
//				System.out.println(x);
//			}	
//		});
		//if male is false print the value
//		emp.forEach(x -> {
//			if (x.isMale() == false)
//				System.out.println(x);
//		});
		
		//if employee is male store the array in another arraylist
//		ArrayList<Employee>male=new ArrayList<>();
//		emp.forEach(x->{
//			if(x.isMale()==true)
//				male.add(x);
//		});
//		System.out.println(male);
		
		
	
		ArrayList<Employee>female=new ArrayList<>();
		emp.forEach(y->{
			if(y.isMale()==false)
				female.add(y);
		});
		System.out.println(female);
		
		//print salary in another array list
		
		ArrayList<Integer>salary=new ArrayList<>();
		emp.forEach(y->
				salary.add(y.getSalary())
		);
		System.out.println(salary);
	}

}

class Employee {
	private String name;
	private int age;
	private int salary;
	private boolean isMale;
	private float exp;

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

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", salary=" + salary + ", isMale=" + isMale + ", exp=" + exp
				+ "]";
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	public Employee(String name, int age, int salary, boolean isMale, float exp) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isMale = isMale;
		this.exp = exp;
	}
}