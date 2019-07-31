package main.java.com.stream;

public class StreamImpl {
	private int id;
	int salary;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public StreamImpl(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StreamImpl [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
