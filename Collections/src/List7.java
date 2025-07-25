import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

// Employee class
class Work {
    int id;
    String name;
    double salary;

    // Constructor
    public Work(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}

public class List7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Work> empVector = new Vector<>();

        // Add Employee objects to the Vector
        empVector.add(new Work(101, "Alice", 50000));
        empVector.add(new Work(102, "Bob", 55000));
        empVector.add(new Work(103, "Charlie", 60000));

        // Using Iterator
        System.out.println("Employees using Iterator:");
        Iterator<Work> it = empVector.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Using Enumeration
        System.out.println("\nEmployees using Enumeration:");
        Enumeration<Work> en = empVector.elements();
       while(en.hasMoreElements()) {
    	   System.out.println(en.nextElement());
       }
	}

}
