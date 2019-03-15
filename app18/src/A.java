class A
{
    int i;
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}

/*
o/p:

C:\javaC\jan30\app18\src>javac -d ../classes A.java
A.java:6: error: non-static variable i cannot be referenced from a static contex
t
                System.out.println(i);
                                   ^
1 error
*/