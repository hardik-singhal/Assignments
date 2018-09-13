import java.io.*;
public class fileaccess
{
	public static void main(String[] x)
	{
		File file= new File("G:/Assignments/Day9/abc.txt");
		
		try{
			FileInputStream finput = new FileInputStream(file);
			
			int i = finput.read();
			
			while(i!=-1)
			{
				System.out.print(i + " : " + (char)i);
				i = finput.read();
			}
				finput.close();
		}
	
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.print("File path: " + file.getPath());
	}
}