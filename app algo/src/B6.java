// print all divisibles of 5 from 1 to 100
class B6 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100;i++)
		{
			if (i%5==0)
			{
				System.out.print(i+",");
			}
		}
	}
}


/*
o/p:
5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,
*/