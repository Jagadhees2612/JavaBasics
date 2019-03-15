class  Z14
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		hello1://loop can have name is labled loop
		for(int i =1; i <= 5; i++)
		{
			System.out.println("loop1 begin with:" +i);
			for(int j = 100; j <= 103; j++)
		   {
			  System.out.println("loop2 begin with :" +i +","+j);
			  if(j == 102)
			   {
				  break hello1;
			   }
			  System.out.println("loop2 end with :" +i +","+j);
		    }
			System.out.println("loop1 end with :" +i);
	    }
		System.out.println("main end");
    }
}

/*
o/p:
main begin
loop1 begin with:1
loop2 begin with :1,100
loop2 end with :1,100
loop2 begin with :1,101
loop2 end with :1,101
loop2 begin with :1,102
main end
*/