class Z10
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		{
			int i=10; // local variable - use only inside Block1 
	        System.out.println("block -start1");
		    System.out.println("block -start2");         // Block1
		    System.out.println("block -start3"); 
		}
       
	     System.out.println("-----------"+i); // Compile time error

		{
		    System.out.println("block -start1"); 
		    System.out.println("block -start2");         // Block2
		    System.out.println("block -start3"); 
		}
		System.out.println("main end");
	}
}
