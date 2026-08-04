class person
{
	String fname,lname;
	person (String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	
	}
}
class student extends person
{
	int rollno;
	String stream;
	int sem;
	student(String fname,String lname,int rollno,String stream,int sem)
	{
		super(fname,lname);
		this.rollno=rollno;
		this.stream=stream;
		this.sem=sem;
	}
	void display()
	{
		System.out.println("Name :"+fname+" "+lname);
		System.out.println("Roll no:"+rollno);
		System.out.println("Division :"+stream+"   "+"sem"+sem);
	}
}
class studDemo
{
	public static void main (String args[])
	{
		student s1=new student("tulsi","Gajera",25,"BBA",3);
		s1.display();
	}
}