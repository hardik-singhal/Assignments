public class Substring
{
	public static void main(String[] x)
	{
		String inp = "abc";
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<=3;j++)
			{
				String str = inp.substring(i,j);
				    System.out.println(str);
			}
		}
	}
}