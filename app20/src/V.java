class V 
{
	V()
	{
		System.out.println("V():" + i);
	}

	{
		System.out.println("IIB:" + i); //in the consr body any var any value can be use even before notify we can use the //perfect the initia providing a var ....
	}
	int i; //illegal fwd is only n the iib..iib is the initializer....direct read cant possible as the  initalizer..

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

//o/p: error in line 9..