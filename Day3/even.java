import java.util.Scanner;
class even{
public static void main(String args[])
{
int i;
System.out.println("Enter an integer");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(i=2;i<=num;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}