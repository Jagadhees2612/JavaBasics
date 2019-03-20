class I 
{
	public static void main(String[] args) 
	{
		int i = 30000;//int is a wider than short ..u have to narrowing at line no.6
		short s1 = i;
		System.out.println(s1);
	}
}

/*
O/P:
C:\javaC\jan30\app32\src>javac -d ../classes I.java
I.java:6: error: incompatible types: possible lossy conversion from int to short

                short s1 = i;
                           ^
1 error
*/