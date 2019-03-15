class Z7
{
	static int i=test1();
	static int j=test1()+test2();
	static
	{
		System.out.println("SIB1"+i+","+j);
		i+=1;
		j+=2;
	}


    public static int test1()
	{
       System.out.println("test1:"+i+","+j);
	   i+=3;
	   j+=4;
	   return i+j+test2();
	}
    public static int test2()
	{
       System.out.println("test2@A:"+i+","+j);
	   i+=5;
	   j+=6;
	   main(null);
	   System.out.println("test2@B:"+i+","+j);
	   return i+j;
	}
	public static void main(String[] args) 
	{
		System.out.println("main"+i+","+j);
		i+=7;
		i+=8;
	}
	
}
