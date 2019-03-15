class M29
{
	public static void main(String[] args) 
	{
		test(1);
	}
	public static void test(int i)
	{
	    if(i==6)
		return;
		System.out.println("begin"+i);
		i++;
		test(i);
	    System.out.println("end"+i); // post recursive statement
	}
}

/*
o/p:
begin1
begin2
begin3
begin4
begin5
end6
end5
end4
end3
end2
*/