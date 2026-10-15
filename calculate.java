public class calculate
{
    void add (int a,int b)
    {
        System.out.println((a+b));
    }
    void add (float a,float b)
    {
        System.out.println((a+b));
    }
    void add (double a,double b)
    {
        System.out.println((a+b));
    }
    public static void main(String[] args)
    {
        calculate c=new calculate();
        c.add(10,20);
        c.add(10.4f,12.5f);
        c.add(19.4,13.5);
    }
}
