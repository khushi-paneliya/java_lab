class fruite
{
	fruite()
	{
		System.out.println("I am super class constructor fruite");
	}
}
class mango extends fruite
{
    mango()
	{
		super();
		System.out.println("I am a sub class mango");
	}
}
class super_constructor
{
    public static void main(String args[])
	{
	 mango m=new mango();
	}
}