//9.print all odd numbers  between two given numbers?
class Q9
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
		    System.out.println("pls supply 3 cla");
	        return;
		}
	    int i = Integer.parseInt(args[0]);
	    int j = Integer.parseInt(args[1]);
        for (int k = i; k <= j; k++)
        {
			if (k % 2 != 0)
			{
				System.out.println(k + ",");
			}
        }
	}
}

/*
o/p:

C:\javaC\jan30\app algo\src>java -cp ../classes Q9  4
49,
51,
53,
55,
57,
59,
61,
63,
65,
67,
69,
71,
73,
75,
77,
79,
81,
83,
85,
87,
89,
91,
93,
95,
97,
99,
*/