class hello
{
	int a;
hello()
{
System.out.println("IN DEFAULT");
}
hello(int a)
{
this();
this.a=a;
System.out.println("In Parameterized");
}
}
class constr
{
public static void main(String[] args)
{
hello obj=new hello(25);
}
}