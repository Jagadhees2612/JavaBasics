class  K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    for(int i = 1; i<=10; i++)    //i = i + 5
        {
           System.out.println("loop begin:" +i);
           if(i == 3)                         
			{                                 
			    System.out.println("if block");
                break;
            }                               
            System.out.println("loop end:" +i);
            System.out.println("=============");
        }
		System.out.println("main end");
    }
}



/*
output
main begin
loop begin:1
loop end:1
=============
loop begin:2
loop end:2
=============
loop begin:3
if block
main end
*/