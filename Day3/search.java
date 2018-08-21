import java.util.Scanner;
class search
{
public static void main(String args[])
{
    int c;
    int arr[]={1,4,6,7,8,9,10};
   System.out.println("Enter the number to be searched");
   Scanner sc=new Scanner(System.in);
   int search=sc.nextInt();
   for (c=0;c<7;c++)
  {
    if (arr[c] == search) 
    {
     System.out.println (search+" is present at location "+(c+1));
      break;
    }
  }
  if (c==7)
{   
 System.out.println(search+" isn't present in the array.");
 }
}
}
