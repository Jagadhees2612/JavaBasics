class  Z9
{
	public static void main(String[] args) 
	{
		for(int i =1; i < 5; i++);//this symbol ; is for loop ending
			System.out.println("Inside body. stmt1:" +i);
			System.out.println("Inside body. stmt2");
			System.out.println("Inside body. stmt3");			
		System.out.println("end");
	}
}

/*
o/p:
Z9.java:6: error: cannot find symbol
                        System.out.println("Inside body. stmt1:" +i);
                                                                  ^
  symbol:   variable i
  location: class Z9
1 error
*/