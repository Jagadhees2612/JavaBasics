class A
{
} 
class B extends A
{
}
class C extends B//even c is a "co varient" A
{
}
class S
{
	B test()
	{
		return null;//while ovrriding in b n c..
	}
}
class T extends S
{
	A test() //CTE
	{
		return null;
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
O/P:
C:\javaC\jan30\app31\src>javac -d ../classes T.java
T.java:19: error: test() in T cannot override test() in S
        A test() //CTE
          ^
  return type A is not compatible with B
1 error
*/