package superkeywords;

public class SuperVarChild extends SuperVariable{

		String color="Blue";
		public void display()
		{
			System.out.println(color);
			System.out.println(super.color);
		}
		public static void main(String args[])
		{
			SuperVarChild obj= new SuperVarChild();
			obj.display();
		}
	}


