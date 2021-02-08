package day6;

class Parent // only parent property
{
int a=10;

}

class Child extends Parent // parent and child property
{
	int a=20;
	void addition()
	{
		int result1= a + a;
		System.out.println("result1"+ result1);
		
	}
}




public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.addition();
		
	}

}
