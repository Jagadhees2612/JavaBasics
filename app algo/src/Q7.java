//7.find out given number is an even or odd?
class Q7
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
		    System.out.println("pls supply 3 cla");
	        return;
		}
	    int i = Integer.parseInt(args[0]);
		boolean isodd = (i % 2 ==0) ? false : true;
		if(isodd)
		{
             System.out.println(i + " is an odd number");
		}
		else
		{
			System.out.println(i + "is an even number");
		}
	}
}

/*
o/p:
C:\javaC\jan30\app algo\src>javac -d ../classes Q7.java

C:\javaC\jan30\app algo\src>java -cp ../classes Q7 8
8is an even number
*/