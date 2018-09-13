interface Animal
{
	void speak();
	void eat();
}
class Dog implements Animal
{
	public void speak()
	{
		System.out.println("Dogs barks so much");
	}
	public void eat()
	{
		System.out.println("Dogs Fights");
	}
}
class Cat implements Animal
{
	public void speak()
	{
		System.out.println("Cats Glows");
	}
	public void eat()
	{
		System.out.println("Cats eats mouse");
	}
}
public class Animal_interface
{
	public static void main(String[] x)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		d.speak();
		d.eat();
		c.speak();
		c.eat();
	}
}