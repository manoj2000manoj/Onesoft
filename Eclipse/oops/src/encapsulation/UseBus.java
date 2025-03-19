package encapsulation;

public class UseBus {
	public static void main(String[]args) {
		Bus b=new Bus("svs","red",1200,false);
		System.out.println(b);
		b.setName("krs");
		System.out.println(b);

		
	}

}
class Bus{
	private String name;
	private String color;
	private int price;
	private boolean isPetrol;
	public Bus(String name,String color,int price,boolean isPetrol) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.isPetrol=isPetrol;
	}
	public String toString() {
		return name+color+price+isPetrol;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setPetrol(boolean petrol) {
		this.isPetrol=petrol;
	}
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	public int getprice() {
		return price;
	}
	public boolean getpetrol() {
		return isPetrol;
	}
	}

