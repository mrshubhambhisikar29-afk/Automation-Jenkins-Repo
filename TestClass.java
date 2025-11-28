package oOOPS;

public class TestClass implements Interface1,Interface2{
	
	
	public void main1() 
	{
		
		System.out.println("Main 1 abstarct Complete Method");
	}
	
	
	public void main2() 
	{
		System.out.println("Main 2 abstarct Complete Method");
		
	}
	
	
	

	
	@Override
	public void interface21(String age) {
		
		if(age.equals("20"))
		{
			
			System.out.println("age is correct");
		}
		
		else {
			
			System.out.println("Wrong");
		}
		
	}


	@Override
	public void interface22(int number) {
	
		
		System.out.println("Number is correct");
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		TestClass inter= new TestClass();
		
		inter.main1();
		inter.main2();
		inter.interface21("20");
		inter.interface22(20);
		
		Interface2.Testmethod();
			
	}


	
	

}
