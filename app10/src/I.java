class  I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	    for(int i = 1; i<=10; i++)    //i = i + 5
        {
           System.out.println("loop begin:" +i);
           if(i <= 6)                         
			{                                 
		        continue;
			    System.out.println("if block");
             }                               
            System.out.println("loop end:" +i);
            System.out.println("=============");
        }
		System.out.println("main end");
    }
}

/*

C:\javaC\jan30\app11\src>cd ../src

C:\javaC\jan30\app11\src>javac -d ../classes I.java
I.java:12: error: unreachable statement //
                            System.out.println("if block");
                            ^
1 error
/*
continue,break,return,throw i
*/