class F 
{
	public static void main(String[] args) 
	{
		int i = 100; //rhs to lhs..
		byte b1 = i;//wider one assigning to wide4r while convert to narrower wider cant compile the narrower
		System.out.println("done");
	}
}

/*
O/P:
C:\javaC\jan30\app32\src>javac -d ../classes F.java
F.java:6: error: incompatible types: possible lossy conversion from int to byte
                byte b1 = i;
                          ^
1 error
*/
