package pratik;

public class Test 
{
	public static void main(String[] args)
	{
		/*
		Employee employee = new Employee("Refiye �ehnaz Y�ld�r�m", "Computer Engineer", 5000);
		employee.showInfos();
		*/
		
		Manager manager = new Manager("Refiye �ehnaz Y�ld�r�m", "Computer Engineer", 5000, 10);
		/*
		manager.showInfos();
		manager.raiseSalary(100);
		*/
		Employee employee = new Manager("Refiye �ehnaz Y�ld�r�m", "Computer Engineer", 5000, 10);
		employee.showInfos();
		//System.out.println(manager);
	}
}
