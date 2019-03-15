class X
{
	static int i=test(); 
	static int j=test(); 

	public static int test() 
	{
		System.out.println("from test"+i+","+j);
		i+=1;
		j+=2;
		return i+j+3;
	}

	public static void main(String[] args) 
	{
		System.out.println("from main:"+i+","+j);
	}
}

/*
from test0,0
from test6,2
from main:7,14
*/