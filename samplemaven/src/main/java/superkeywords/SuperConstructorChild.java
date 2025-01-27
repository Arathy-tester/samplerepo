package superkeywords;

public class SuperConstructorChild extends SuperConstructor{
	public SuperConstructorChild()
	{
		super(5,6);
		System.out.println("Default");
	}

	public static void main(String[] args) {
		SuperConstructorChild obj= new SuperConstructorChild();

	}

}
