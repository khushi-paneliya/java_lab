import java.sql.SQLOutput;

public class arithmeticCOM {
    public static void main(String[] args)
    {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        System.out.println("Addition:"+(num1 + num2));
        System.out.println("subtraction:"+(num1 - num2));
        System.out.println("multiplication:"+(num1 * num2));
        System.out.println("division:"+(num1 / num2));
    }
}
