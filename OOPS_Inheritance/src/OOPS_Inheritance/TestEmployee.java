package OOPS_Inheritance;
class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}
class Employee extends Person{
	 int yearStarted;
	 double annualSalary;
	 String nationalInsuranceNumber;
	
  Employee(String name,  double annualSalary, int yearStarted, String nationalInsuranceNumber){
		super(name);
		this.annualSalary = annualSalary;
		this.yearStarted = yearStarted;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	public void setyearStarted(int yearStarted ) {
		this.yearStarted = yearStarted;
	}
	public void setannualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public void setnationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	public int getyearStarted() {
		return yearStarted;
	}
	public double getannualSalary() {
		return annualSalary;
	}
	public String getnationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}
	
}
public class TestEmployee {

	public static void main(String[] args) {
		 Employee emp = new Employee("Alice Johnson", 60000.00, 2018, "NI123456A");
		 
		 System.out.println("Employee Details:");
	        System.out.println("Name: " + emp.getname());
	        System.out.println("Annual Salary: $" + emp.getannualSalary());
	        System.out.println("Year Started: " + emp.getyearStarted());
	        System.out.println("National Insurance Number: " + emp.getnationalInsuranceNumber());

	        // Modify some details
	        emp.setannualSalary(65000.00);
	        emp.setyearStarted(2017);

	        // Display updated details
	        System.out.println("\nUpdated Employee Details:");
	        System.out.println("Name: " + emp.getname());
	        System.out.println("Annual Salary: $" + emp.getannualSalary());
	        System.out.println("Year Started: " + emp.getyearStarted());
	        System.out.println("National Insurance Number: " + emp.getnationalInsuranceNumber());
	}

}
