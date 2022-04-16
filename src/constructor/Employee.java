package constructor;

public class Employee {

	int employeeId;
	String employeeName;
	
	public Employee(int empid,String empName) {
		employeeId=empid;
		employeeName=empName;
	}
	void info() {
		System.out.println("Id: "+employeeId+" "+"Name: "+employeeName);
	}
	public static void main(String[] args) {
		
		Employee E1=new Employee(21,"paul");
		E1.info();
		Employee E2=new Employee(22,"farzana");
		E2.info();
		Employee E3=new Employee(23,"shahidul");
		E3.info();
		Employee E4=new Employee(24,"k");
		E4.info();
		
	}
}
