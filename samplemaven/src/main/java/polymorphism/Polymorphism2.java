package polymorphism;

public class Polymorphism2 extends Polymorphism1 {
	public void display (int a,int b)
	{
		
	int c=a-b;
	System.out.println(c);
    super.display( a, b);
}

	public static void main(String[] args) {
		
		Polymorphism2 obj= new Polymorphism2();
		obj.display(12,10);

	}

}
