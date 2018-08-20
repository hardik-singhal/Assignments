class prime
{
public static void main(String args[])
{
int n=99,i,flag=0;
//Scanner sc=new Scanner(System.in);
for(i=2;i<n-1;i++)
{
  if(n%i==0)
  {
      flag=1;
break;
  }
}
if(flag==0)  
{
   System.out.println(n+" IS A PRIME NUMBER");
}
else
{
	 System.out.println(n+" IS NOT A PRIME NUMBER");
}
}
}

