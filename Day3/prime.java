import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int i,j,flag=0;
System.out.println("enter a integer :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=2;i<n;i++)
{
  flag=0;
for(j=2;j<i;j++)
{
  if(i%j==0)
  {
      flag=1;
break;
  }
}
if(flag==0)  
{
   System.out.println(i);
}
}
}
}

