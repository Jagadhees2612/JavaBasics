class A
{
	static int i;
}
class L
{
	public static void main(String[] args) 
	{
		System.out.println("main:" +i);
	}
}


/*
o/p:
L.java:9: error: cannot find symbol
                System.out.println("main:" +i);
                                            ^
  symbol:   variable i
  location: class L
1 error

C:\javaC\jan30\app16\src>javac -d ../classes L.java
L.java:9: error: cannot find symbol
                System.out.println("main:" +i);
                                            ^
  symbol:   variable i
  location: class A
1 error
*/