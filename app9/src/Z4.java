class  Z4
{
	enum E {CON1, CON2, CON3, CON4};//this enum is derived one or predefined data
	public static void main(String[] args) 
	{
		E e1 = E.CON1;
		switch( e1 )
		{
			case CON1 :
				System.out.println("from case CON1");
				break;
			case CON2 :
				System.out.println("from case CON2");
				break;
				
			case CON3 ://it will continue end of the case//so it must breeak or end switch case// 
				System.out.println("from case CON3");
				break;
			case CON4 :
				System.out.println("from case CON4");
				break;
		}
		System.out.println("end");
	}
}