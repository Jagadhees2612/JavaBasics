class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		{
	        System.out.println("block -start1");
		    System.out.println("block -start2");         // Block1
		    System.out.println("block -start3"); 
		}
       
	     System.out.println("-----------");

		{
		    System.out.println("block -start1"); 
		    System.out.println("block -start2");         // Block2
		    System.out.println("block -start3"); 
		}
		System.out.println("main end");
	}
}
