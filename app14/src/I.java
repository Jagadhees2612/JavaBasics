class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main middle");
		System.out.println("main end");
		return 100;//return stmt witha value not allowed..every methods should have ret type..its mantatory..ret type should be before name of the method..
//there are 3 different return types available..(1.void,2.any primitive data type,3.any derived data type)..(void mains it should not return a value)
// because return stmt it not a mantatory
	}
}

/*
o/p:
I.java:8: error: incompatible types: unexpected return value
                return 100;
                       ^
1 error
*/