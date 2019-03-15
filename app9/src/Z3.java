class  Z3
{
	public static void main(String[] args) 
	{
		char i ='a';//switch arguement predefined data 
		switch( i )
		{
			case 66000 :
				System.out.println("from case 66000");//compiler well known about char,short,byte range..so compiler error for this case 66000//
				break;
			case 'p' :
				System.out.println("from case p");
				break;
				
			case 's' ://it will continue end of the case//so it must breeak or end switch case// 
				System.out.println("from case s");
				break;
		}
		System.out.println("end");
	}
}