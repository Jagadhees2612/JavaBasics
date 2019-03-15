class  D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    for(int i = 0; i<=30; i+=5)   //i = i + 5
        {
           System.out.println("loop begin:" +i);
           System.out.println("loop end:" +i);
           System.out.println("===========");
		}
		System.out.println("main end");
    }
}

/*
o/p:
main begin
loop begin:0
loop end:0
===========
loop begin:5
loop end:5
===========
loop begin:10
loop end:10
===========
loop begin:15
loop end:15
===========
loop begin:20
loop end:20
===========
loop begin:25
loop end:25
===========
loop begin:30
loop end:30
===========
main end
*/