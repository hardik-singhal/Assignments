import java.util.*;
class parent
{
	int x;
	int y;
   
   void getdata()
	{
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
	}
	
	void showdata()
	{
		System.out.println("x = " +x);
		System.out.println("y = " +y);
	}
}		
	class child extends parent
	{
		void yay()
		{
			super.getdata();
		   super.showdata();
		}
	}
	
	class parent_invoke
	{
		public static void main(String args[])
		{
			child obj=new child();
			obj.yay();
		}
	}
	