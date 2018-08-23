import java.util.Scanner;
class Rectangle
{
int length,breadth;
Rectangle(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
}
int calculate_area()
{
return length*breadth;
}
}


class RectangleArea
{
public static void main(String args[])
{
int len,bre,vol;
System.out.println("Enter the length");
Scanner sc=new Scanner(System.in);
len=sc.nextInt();
System.out.println("Enter the Breadth");
bre=sc.nextInt();
Rectangle R;
R=new Rectangle(len,bre);
vol=R.calculate_area();
System.out.println("The Area of Rectangle is = "+vol);
}
}