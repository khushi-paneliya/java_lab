class counter_Demo
{
	static int count=0;//memory only once and retain its value
	counter_Demo()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String args[])
	{
		counter_Demo c1=new counter_Demo();
		counter_Demo c2=new counter_Demo();
		counter_Demo c3=new counter_Demo();
		
	}
}