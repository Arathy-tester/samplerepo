package interfaceex;

public class Interface2 implements Interface1{
	public void show()
	{
		System.out.println("Show Method");
	}

	public static void main(String[] args) {
		
		//Interface2 obj= new Interface2();//OBJECT METHOD
		Interface1 obj1= new Interface2();//REFERENCE METHOD
		//obj.show();
		obj1.display();

	}

	@Override
	public void display() {
		System.out.println("Implement Method");
		
	}

}
