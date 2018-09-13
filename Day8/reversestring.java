import java.util.Scanner;
public class reversestring
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		StringBuilder rev = new StringBuilder();
		rev.append(s);
		rev = rev.reverse();
		System.out.println(rev);
	}
}