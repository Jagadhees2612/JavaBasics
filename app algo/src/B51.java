//print all odd no from 1 to 100
class B51
{
	public static void main(String[] args) 
	{
		test(1);
	}
	static void test(int i)
	{
		if (i==101)
		{
			return;
		}
		if(i%2==1) //i!=0
		{
			System.out.print(i+",");
		}
	    test(++i);
	}
}

/*
o/p:
1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,5
7,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,
*/