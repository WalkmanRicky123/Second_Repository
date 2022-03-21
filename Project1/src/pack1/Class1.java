package pack1;

public class Class1 
{
     int a,b,results;
	
	public Class1(int a, int b) 
	{
	  super();
	  this.a = a;
	  this.b = b;
	
	}

	public void add()
	{
		results = a+b;
		System.out.println("Add of A & B is: "+ results);
		
	}
	
	public void sub()
	{
		results = a-b;
		System.out.println("Sub of A & B is: "+ results);

}
	public static void main(String[] args) 
	{
		 Class1 c1 = new Class1(10,20);
		c1.add();
		c1.sub();
		
		
	}
}