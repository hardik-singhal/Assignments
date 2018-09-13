import java.io.*;
public class copyfile
{
	public static void main(String[] x)
	{
		File f1 = new File("G:/Assignments/Day10/abc.txt");
		File f2 = new File("G:/Assignments/Day10/xyz.txt");
		
		int i;
		try{
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			
			i = fin.read();
			
			while(i!=-1)
			{
				fout.write((char)i);
				i = fin.read();
				
			}
				fin.close();
				fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
		
