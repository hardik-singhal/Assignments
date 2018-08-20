class palindrome
{
public static void main(String args[])
{
int num=38383,compare=0,rev=0,mod=0;
compare=num;
while (num!=0)
{
mod=num%10;
rev=rev*10 + mod;
num=num/10;
}
if(compare==rev)
{
System.out.println(compare+" is a Palindrome number");
}
else
System.out.println("Number is not Palindrome");
}
}