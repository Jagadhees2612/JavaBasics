class A 
{
	void test()
	{
		System.out.println("superclass -test()");
	}
}
class L extends A
{
	int test()
	{
		System.out.println("subclass-test()");//super class mtd sign and sub class mtd is same return type.. is while attemying the ovr rid same return type..u will be gettingb co,pilation error..
		return 10;
	}
	public static void main(String[] args) 
	{
		L obj = new L();
		obj.test();
		System.out.println("done");//u cnat go for diff ret type
		{
		}
	}
}

/*
O/P:
C:\javaC\jan30\app31\src>javac -d ../classes L.java
L.java:10: error: test() in L cannot override test() in A
        int test()
            ^
  return type int is not compatible with void
1 error
*?
