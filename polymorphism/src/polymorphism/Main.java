package polymorphism;

class Animal
{
	private String name;

	public Animal(String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public void speak()
	{
		System.out.println("Hayvan konuþuyor...");
	}
}

class Bird extends Animal
{

	public Bird(String name)
	{
		super(name);
	}

	@Override
	public void speak()
	{
		System.out.println(getName() + " ötüyor...");
	}
}

class Dog extends Animal
{

	public Dog(String name)
	{
		super(name);
	}

	@Override
	public void speak()
	{
		System.out.println(getName() + " havlýyor...");
	}
}

class Horse extends Animal
{

	public Horse(String name)
	{
		super(name);
	}

	@Override
	public void speak()
	{
		System.out.println(getName() + " kiþniyor...");
	}
}

public class Main 
{
	public static void speaktry(Animal animal)
	{
		animal.speak();
	}
	public static void main(String[] args)
	{
		Animal animal = new Animal("Hayvan");
		Bird bird = new Bird("Limon");
		Dog dog = new Dog("Çakýr");
		Horse horse = new Horse("Poyraz");
		
		animal.speak();
		bird.speak();
		dog.speak();
		horse.speak();
		
		System.out.println();
		Animal animal2 = new Bird("Limon");
		animal2.speak();
		Animal animal3 = new Dog("Çakýr");
		animal3.speak();
		Animal animal4 = new Horse("Poyraz");
		animal4.speak();
		
		System.out.println();
		speaktry(new Bird("Limon"));
		speaktry(new Dog("Çakýr"));
		speaktry(new Horse("Poyraz"));
	}
}
