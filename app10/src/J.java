class  J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    for(int i = 1; i<=10; i++)    //i = i + 5
        {
           System.out.println("loop begin:" +i);
           if(i <= 6)                         
			{  
			   if(i==6)
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
main begin
loop begin:1
if block
main end
*/
