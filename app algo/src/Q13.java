 //13. Swap two int variables without 3rd variable?
  class Q13
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
		System.out.println("enter 2 cla");
		return;
		}
	    int num1 = Integer.parseInt(args[0]);
	    int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + "," + num2);
		/*
		//with 3rd variable
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1 + "," +num2); (swaping two variables)
		*/
		//without 3rd variable
		//num1 = 3,num2 =4*/
		num1 = num1 + num2; 
		num2 = num1 - num2; 
		num1 = num1 - num2; 
		System.out.println(num1 + "," +num2);
	}
}
 
/*
o/p:
C:\javaC\jan30\app algo\src>java -cp ../classes Q13 1 3
1,3
3,1
*/