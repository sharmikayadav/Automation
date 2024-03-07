package Oops;

public class Employee {
	int EmpId;
	String Ename;
	String Ejob;
	int Esal;
	
	Employee(String Ename, int EmpId,String Ejob,int Esal)
	{
		this.Ename=Ename;
		this.EmpId=EmpId;
		this.Ejob=Ejob;
	    this.Esal=Esal;
	    
	    	
	    }
		
	
		
	void Display() {
		System.out.println(EmpId);
		System.out.println(Ename);
		System.out.println(Ejob);
		System.out.println(Esal);
		
	}
	void Show() {
		System.out.println("Next Empolyee Data");
		
	}

	public static void main(String[] args) {
		Employee Emp1=new Employee("Sharmika",5,"Tester",80000);
		Emp1.Display();
		Emp1.Show();
		
		Employee Emp2=new Employee("Rushika",9,"Tester",60000);
		Emp2.Display();
		Emp2.Show();
		
		Employee Emp3=new Employee("Manjula",4,"Tester",40000);
		Emp3.Display();
		Emp3.Show();
		
		

	}

}
