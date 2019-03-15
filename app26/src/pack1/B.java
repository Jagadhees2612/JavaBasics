package pack1;
class B
{
	public static void main(String[] args) //save it is a pack u can able to use default scoped me will allowed to use within the same package...
	{
		A a1 = new A();
		System.out.println(a1.i);
		a1.test();
	}
}

/*
o/p:
C:\javaC\jan30\app26\src>javac -d ../classes pack1/B.java

C:\javaC\jan30\app26\src>java -cp ../classes pack1.B
0
*/