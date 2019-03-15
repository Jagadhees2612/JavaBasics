class  Z15
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		hello1://any loop can have a name on its top name column break or continue with outer loop is labled loop
		for(int i =1; i <= 5; i++)
		{
			System.out.println("loop1 begin with:" +i);
			for(int j = 100; j <= 103; j++)
		   {
			  System.out.println("loop2 begin with :" +i +","+j);
			  if(j == 102)
			   {
				  continue hello1;
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
loop1 begin with:2
loop2 begin with :2,100
loop2 end with :2,100
loop2 begin with :2,101
loop2 end with :2,101
loop2 begin with :2,102
loop1 begin with:3
loop2 begin with :3,100
loop2 end with :3,100
loop2 begin with :3,101
loop2 end with :3,101
loop2 begin with :3,102
loop1 begin with:4
loop2 begin with :4,100
loop2 end with :4,100
loop2 begin with :4,101
loop2 end with :4,101
loop2 begin with :4,102
loop1 begin with:5
loop2 begin with :5,100
loop2 end with :5,100
loop2 begin with :5,101
loop2 end with :5,101
loop2 begin with :5,102
main end
*/