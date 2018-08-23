import java.util.Scanner;
class Array
{
   void second_largest(int arr[],int size)
{
	int first,second,i;
 first=second=Integer.MIN_VALUE;                                                                        
 for(i=0;i<size;i++)
 {
 if(arr[i]>first)
 {
 second=first;
 first=arr[i];
 }
 else if(arr[i]<first && arr[i]>second)
 {
 second=arr[i];
 }
 }
 System.out.println("The second largest element is "+second);
 }
}
 class secondlargest
 {
   public static void main(String args[])
 {
	 int i,j,size;
	 Array A=new Array() ;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of Array");
	size=sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the value of Array");
    for(i=0;i<size;i++)
    {
    arr[i]=sc.nextInt();
    }
    A.second_largest(arr,size);
	}
	}
 

