package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

public class UseStudent {
	public static void main(String[] args) {
		List<Student>stu=new ArrayList<>();
		Student stu1=new Student("Jeeva", 24, 20000, true, 12.0f);
		Student stu2=new Student("pradeep", 26, 30000, true, 13.0f);
		Student stu3=new Student("poovu", 25, 25000, true, 11.0f);
		Student stu4=new Student("karthi", 28, 35000, true, 14.0f);
		Student stu5=new Student("lokesh", 27, 40000, true, 16.0f);
		stu.add(stu1);
		stu.add(stu2);
		stu.add(stu3);
		stu.add(stu4);
		stu.add(stu5);
/*		for(int i=0;i<stu.size();i++) {
			if(stu.get(i).getSalary()>25000)
				stu.get(i).setSalary(stu.get(i).getSalary()-500);
		}
		System.out.println(stu);strat with s,max price;*/
		//Name Start With s then store the another array;
		ArrayList<Student>s=new ArrayList<>();
		for(int i=0;i<stu.size();i++) {
			if(stu.get(i).getName().startsWith("J"))
				s.add(stu.get(i));
		}
		System.out.println(s);
		//find max length and print the who are the maximum name length print the name;
		Student max=stu.get(0);
		for(int i=0;i<stu.size();i++) {
			if(stu.get(i).getName().length()>max.getName().length()) {
				max=stu.get(i);
			}
		}
		System.out.println(max);
		
	

	}
}

class Student {
	private String name;
	private int age;
	private int salary;
	private boolean ismale;
	private float std;
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", salary=" + salary + ", ismale=" + ismale + ", std=" + std
				+ "]";
	}
	public Student(String name, int age, int salary, boolean ismale, float std) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.ismale = ismale;
		this.std = std;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isIsmale() {
		return ismale;
	}
	public void setIsmale(boolean ismale) {
		this.ismale = ismale;
	}
	public float getStd() {
		return std;
	}
	public void setStd(float std) {
		this.std = std;
	}
}
