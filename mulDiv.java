class Addsub
{
    int num1;
    int num2;
    Addsub(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    int calAdd()
    {
        return num1 + num2;
    }
    int calSub()
    {
        return num1 - num2;
    }
}

public class mulDiv extends Addsub
{
    mulDiv(int num1,int num2)
    {
        super(num1,num2);
    }
    int calMul()
    {
        return num1 *num2;
    }
    double calDiv()
    {
        return(double) num1 /num2;
    }

    public static void main(String[] args)
    {
        mulDiv op=new mulDiv(30,5);
        System.out.println(op.calAdd());
        System.out.println(op.calSub());
        System.out.println(op.calMul());
        System.out.println(op.calDiv());
    }
}
