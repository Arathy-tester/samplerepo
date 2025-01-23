package inheritance;

public class MultiLevelChildC extends MultiLevelParentB{
	public void display2()
	{
		System.out.println("ParentC Class");
	
	}

	public static void main(String[] args) {
		MultiLevelChildC obj= new MultiLevelChildC();
		obj.display();
		obj.display1();
		obj.display2();

	}

}
