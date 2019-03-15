class G 
{
	abstract void test1() 
	{
	}
}

/*
o/p:
G.java:1: error: G is not abstract and does not override abstract method test1(
 in G
class G
^
G.java:3: error: abstract methods cannot have a body
        abstract void test1()
                      ^
2 errors
*/