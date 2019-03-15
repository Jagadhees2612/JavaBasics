class  B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    for(int i = 10; i>=5; i--)//initialitation only one time execute and boolean condition and increment//
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
loop begin:10
loop end:10
===========
loop begin:9
loop end:9
===========
loop begin:8
loop end:8
===========
loop begin:7
loop end:7
===========
loop begin:6
loop end:6
===========
loop begin:5
loop end:5
===========
main endloop begin:10
loop end:10
===========
loop begin:9
loop end:9
===========
loop begin:8
loop end:8
===========
loop begin:7
loop end:7
===========
loop begin:6
loop end:6
===========
loop begin:5
loop end:5
===========
main end
*/