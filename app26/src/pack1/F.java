package pack2;
class F 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("done");//if have to spescidfed use 1 package from another package...
	}
}
/*
o/p:
C:\javaC\jan30\app26\src>javac -d ../classes pack1/F.java
pack1\F.java:6: error: cannot find symbol
                A a1 = new A();
                ^
  symbol:   class A
  location: class F
pack1\F.java:6: error: cannot find symbol
                A a1 = new A();
                           ^
  symbol:   class A
  location: class F
2 errors
*/
