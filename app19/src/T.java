class T 
{
	T()
	{
		this(90);//1st one calling 2nd const...2nd one calling 1st one...there is a reason ...while covering inheritance know the reason..if ther is a recursive..cyclic..
	}

	T(int i) 
	{
		this();
	}
}

/*
o/p:
T.java:8: error: recursive constructor invocation
        T(int i)
        ^
1 error
*/