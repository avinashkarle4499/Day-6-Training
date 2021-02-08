package day6;

 class ToStringDemo {

	int id;
	String name;
	
	
	
	public ToStringDemo(int id, String name) {
		
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


public class ToStringDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

ToStringDemo emp1= new ToStringDemo(1, "sachin");
ToStringDemo emp2= new ToStringDemo(2, "avi");

System.out.println(emp1);
System.out.println(emp2);
	}


}
 }


