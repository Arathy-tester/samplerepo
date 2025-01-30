package assiginheritance;

public class AssigInherC extends AssigInherB{
	float tSalary;
	public void total()
	{
		this.tSalary=this.bpay+this.hra-this.pf-this.ded+this.bon;
	}
	public void salaryslip()
	{
		System.out.println("Basic pay:"+this.bpay+'\n'+"Deduction: "+this.ded+'\n'+"HRA: "+this.hra+'\n'+"PF: "+this.pf+'\n'+"Bonus: "+this.bon+'\n'+"Total Salary by hand:"+this.tSalary);
	}
	public static void main(String[] args) {
		AssigInherC obj=new AssigInherC();
		obj.initial(2500f,500f,1000f);
		obj.calc1();
		obj.total();
		obj.salaryslip();

	}

}
