class M28
{
	public static void main(String[] args) 
	{
		test(1);
	}
	public static void test(int i)
	{
	    if(i==6)
		{return;}
		System.out.println("begin");
		i++;
		test(i);
	    System.out.println("end"); // post recursive statement
	}
}

/*
o/p:
begin
begin
begin
begin
begin
end
end
end
end
end
*/