class  M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");//
	    for(int i = 1; i<=10; i++)    //i = i + 5
        {
           System.out.println("loop body:" +i);
        }
		System.out.println("main end:" +i);
    }
}

/*
C:\javaC\jan30\app11\src>javac -d ../classes M.java
M.java:10: error: cannot find symbol
                System.out.println("main end:" +i);
                                                ^
  symbol:   variable i
  location: class M
1 error
*/