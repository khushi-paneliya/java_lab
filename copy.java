/* Copy File */
import java.io.*;

public class copy
{
    public static void main(String args[])
    {
        try
        {
            FileReader fr = new FileReader("A1.txt");
            FileWriter fw = new FileWriter("A2.txt");
            int i;
            while((i = fr.read()) != -1)
            {
                fw.write(i);
            }
            fr.close();
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        System.out.println("File Copied");
    }
}