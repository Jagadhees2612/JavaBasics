class M25
{
	public static void main(String[] args) 
	{
		test(1);
	}
	public static void test(int i)
	{
		System.out.println("begin");
		System.out.println("end");
        if(i==5)
		{return;}
		i++;
		test(i);
	}

}

/*
o/p:
begin
end
begin
end
begin
end
begin
end
begin
end
*/