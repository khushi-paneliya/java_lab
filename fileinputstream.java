//Example of fileinputstream class to read data from text file.
import java.io.*;
public class fileinputstream
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream input=new FileInputStream("input.txt");
			System.out.println("Data in the file:");
			
			//Reads the first byte
			int i = input.read();
			while(i != -1)
			{
				System.out.print((char)i);
				//read next byte from the file
				i = input.read();
			}
			input.close();
		}
		catch(Exception e)
		{
				e.getStackTrace();
		}
		
	}
}