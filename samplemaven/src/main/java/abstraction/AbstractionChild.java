package abstraction;

public class AbstractionChild extends AbstractionParent{

	public void show() {
		System.out.println("SHOW");
	}
	public static void main(String[] args) {
		//AbstractionChild obj= new AbstractionChild();//OBJECT CREATION
		AbstractionParent obj= new AbstractionChild();//REFERENCE CREATION
		obj.display();
		obj.display1();
		obj.print();
		
	}
	

	@Override
	public void display() {
		System.out.println("DISPLAY");
		
	}

	@Override
	public void display1() {
		System.out.println("DISPLAY1");
		
	}

}
