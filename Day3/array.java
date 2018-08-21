class array
{
public static void main(String args[])
{
int i,j;
int arr[]={1,1,1,1,0,0,1,0};
for(i=0;i<8;i++)
{
for(j=i+1;j<8;j++)
{
if(arr[i]>arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(i=0;i<8;i++)
{
System.out.println(arr[i]);
} 	
}
}
 	