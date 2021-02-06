package interfaces;

public class Main 
{
	public static void main(String[] args)
	{
		/*
		Customer customer = new Customer();
		Student student = new Student();
		student.log();
		customer.log();
		*/
		IDatabase database1 = new Customer();
		IDatabase database2 = new Student();
		database1.log();
		database2.log();
	}
}
