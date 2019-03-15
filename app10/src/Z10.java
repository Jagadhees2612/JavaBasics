class  Z10
{
	public static void main(String[] args) 
	{
		int i;
		for(i =1; i < 5; i++);//loop is executing without any body:so i value is 5 in line 7 
			System.out.println("Inside body. stmt1:" +i);
			System.out.println("Inside body. stmt2");
			System.out.println("Inside body. stmt3");			
		System.out.println("end");
	}
}

/*
o/p:
Inside body. stmt1:5
Inside body. stmt2
Inside body. stmt3
end
*/