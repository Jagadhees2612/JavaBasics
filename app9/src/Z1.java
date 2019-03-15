class  Z1
{
	public static void main(String[] args) 
	{
		char i ='a';
		switch( i )
		{
			case 'a' :
				System.out.println("from case a");
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