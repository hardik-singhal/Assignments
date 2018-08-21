import java.util.Scanner;
import java.lang.Math;
class armstrong
{
public static void main(String args[])
{
int count=0,original=0,r=0;
System.out.println("enter a integer :");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
double remainder=0,newno=0;
original=num;
while(num>0)
{
num=num/10;
count=count+1;
}
num=original;
while(num!=0)
{
remainder=num%10;
newno=newno+Math.pow(remainder,count);
num=num/10;
}
if(newno==original)
{
System.out.println("it is armstrong no");
}
else
System.out.println("it is not armstrong no");
}
}

