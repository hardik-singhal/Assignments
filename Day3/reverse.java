import java.util.Scanner;
class reverse{   
public static void main(String args[])
{    
int mod=0,rev=0,ori;
System.out.println("enter a integer :");
Scanner in=new Scanner(System.in);
int num = in.nextInt();
ori=num;
while(num!=0)
 {
  mod=num%10;
  rev=rev*10+mod;
  num=num/10;
 }
  System.out.println(rev+" is reverse of "+ori);
 }
}