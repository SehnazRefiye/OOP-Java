package myProject7;

public class TestGeometricObject 
{
	public static void main(String[] args)
	{
		GeometricObject[] objects = {new Square(2), new Circle(5), new Square(5), new Rectangle(3, 4), new Square(4.5)};

		for (int i = 0; i < objects.length; i++) 
		{
			System.out.println(objects[i].toString());
			if (objects[i] instanceof Colorable)
			{
					((Colorable) objects[i]).howToColor();
			}
			System.out.println();
		}
	}
}
