package Collections;

public class Employee {

	int id;
	String name;
	double salalry;
	char sex;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalalry() {
		return salalry;
	}
	public void setSalalry(double salalry) {
		this.salalry = salalry;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Employee(int id, String name, double salalry, char sex) {
		super();
		this.id = id;
		this.name = name;
		this.salalry = salalry;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salalry=" + salalry + ", sex=" + sex + "]";
	}
	
	
}
