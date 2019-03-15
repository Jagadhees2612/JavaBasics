//1.print smaller number from 3 given number
class Q2
{
	public static void main(String[] args) 
	{
		if(args.length < 3)
		{
		System.out.println("pls supply 3 cla");
	    return;
		}
	int i = Integer.parseInt(args[0]);
	int j = Integer.parseInt(args[1]);
	int k = Integer.parseInt(args[2]);
	int min = i < k ?(i < j ? i : j) : (k < j ? k : j);	
		System.out.println("smaller number:"+ min);
	}
}
                         
/*
o/p:
C:\javaC\jan30\app algo\src>java -cp ../classes Q2 3 2 0
smaller number:0
*/