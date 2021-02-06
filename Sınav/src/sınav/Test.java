package sýnav;

public class Test {
	/*
	public static void main(String[] args) {
		int[] list1 = {3, 2, 1};
		int[] list2 = {1, 2, 3};
		list2 = list1;
		System.out.print(list2[0]);
		System.out.print(list2[1]);
		System.out.print(list2[2]);
		System.out.println();
		list1[0] = 0; list1[1] = 1; list2[2] = 2;
		System.out.print(list1[0]);
		System.out.print(list1[1]);
		System.out.print(list1[2]);
		System.out.println();
		
		for (int i = list2.length - 1; i >= 0; i--)
			System.out.print(list2[i] + " ");
	}
	*/
	public static void main(String[] args) {
		Count mycount = new Count();
		int times = 0;
		for(int i = 0; i < 100; i++)
		{
			increment(mycount, times);
		}
		System.out.println("count is " + mycount.count);
		System.out.println("times is " + times);
	}

	private static void increment(Count c, int times) 
	{
		c.count++;
		times++;
	}
}
