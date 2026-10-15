public class TestThread extends Thread
{
   TestThread(String name)
   {
       super(name);
   }
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(this+":"+i);
        }
    }
    public static void main(String[] args)
    {
        TestThread t1=new TestThread("Thread 1 ");
        TestThread t2=new TestThread("Thread 2 ");
        t1.start();
        t2.start();
    }
}
