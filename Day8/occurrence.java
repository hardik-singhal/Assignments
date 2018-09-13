import java.util.Scanner;
public class occurrence
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1: ");
		String str = sc.nextLine();
		System.out.println("Enter string2: ");
		String find = sc.nextLine();
		
		boolean res = str.contains(find);
		
		System.out.println(res);
	}
}