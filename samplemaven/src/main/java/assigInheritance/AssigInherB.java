package assiginheritance;

public class AssigInherB extends AssigInherA{
	float hra;
	float pf;
	public void calc1()
	{
		
		this.hra=5*this.bpay/100;
		this.pf=20*this.bpay/100;
		//System.out.println("HRA: "+this.hra+'\n'+"PF: "+ this.pf);
	}
	
}
