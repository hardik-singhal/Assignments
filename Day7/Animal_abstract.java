abstract class Animals
{
    String color, breed, name;
	abstract void eat();
	void speak()
	{
		System.out.println("Speak");
	}
}
class Dog extends Animals
{
	public void eat()
	{
		System.out.println("Dogs fights");
	}
}
class Cat extends Animals
{
	public void eat()
	{
		System.out.println("Cats eats mouse");
	}
}
public class Animal_abstract
{
	public static void main(String[] x)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		d.color = "Black";
		d.breed = "Desi";
		d.name = "Oye";
	    System.out.println("Name : " + d.name + " Breed: " + d.breed + " Color: " + d.color);
		d.eat();
		c.color = "Golden";
		c.breed = "Jungli";
		c.name = "Billi";
		System.out.println("Name: " + c.name + " Breed: " + c.breed + " Color: " + c.color);
		c.eat();
	}
}