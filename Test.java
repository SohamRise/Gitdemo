
public class Test {
	int id = 10;
	String name = "ashish";
	String middlename = "rohidas";
	String lastname = "zaware";
	
	public void m1()
	{
		Test t = new Test();
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.middlename);
		System.out.println(t.lastname);
	}
	
	public void m2()
	{
	String address = "takali dhokeshwar";
	int contactno = 1234567890;
	System.out.println(address);
	System.out.println(contactno);

	
		
	}	
	public static void main(String[] args) {
		System.out.println("this is a main method");
		Test t1 = new Test();
		t1.m1();
		t1.m2();
		
	}
}

