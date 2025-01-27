package superkeywords;

public class SuperChildMethod extends SuperMethod{
	public void display()
	{
		System.out.println("This is child");
		super.display();
	}


	public static void main(String[] args) {
		SuperChildMethod obj= new SuperChildMethod();
		obj.display();
		
	

	}

}
