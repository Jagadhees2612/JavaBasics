class  C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    for(int i = 10; i>=0; i =i - 2)  //i -=2 internally it is i=i -2
        {
           System.out.println("loop begin:" +i);
           System.out.println("loop end:" +i);
           System.out.println("===========");
		}
		System.out.println("main end");
    }
}


//main begin
loop begin:10
loop end:10
===========
loop begin:8
loop end:8
===========
loop begin:6
loop end:6
===========
loop begin:4
loop end:4
===========
loop begin:2
loop end:2
===========
loop begin:0
loop end:0
===========
main end//
