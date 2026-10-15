public class multiplecatch
{
    public static void main (String[] args)
    {
        try
        {
         int[] arr=new int[2];
         arr[3]=30/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("caught ArithmeticException:Division by zero ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("caught ArrayIndexOutOfBoundsException");
        }
    }
}
