import java.util.Scanner;
public class String_to_int
{
	public static void main(String[] x)
	{
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String input1 = sc.next();
		System.out.println("Enter 2nd string: ");
		String input2 = sc.next();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		if(num1>num2)
		{
			max = num1;
		}
		else
		{
			max = num2;
		}
		System.out.println("Maximum of the two : " + max);
	}
}