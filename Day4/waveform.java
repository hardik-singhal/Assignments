import java.util.Scanner;
class wave_forms
{
 void swap(int arr[],int size)
{
   int i,temp;

  for(i=0;i<size;i+=2)
   {
     temp=arr[i];
     arr[i]=arr[i+1];
     arr[i+1]=temp;
     } 
 for (i=0; i<size; i++)
      System.out.println(arr[i]);
}
}
class waveform
{
	public static void main(String args[])
	{
    int i,size;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of Array");
    size=sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the value of Array");
    for(i=0;i<size;i++)
    {
    arr[i]=sc.nextInt();
    }
   wave_forms w=new wave_forms();
   w.swap(arr,size);
}
}

