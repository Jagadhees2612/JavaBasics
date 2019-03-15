class BS
{
public static void main(String[] args)
{
if (args.length  <   1)
{
System.out.println("pls enter 1 cla");
return;
}
int num = Integer.parseInt(args[0]);
boolean isRaising = true;
int i = num, currentDigit , prevDigit = i%10;
i = i /10;
while( i != 0)
{ 
currentDigit = i % 10;
if( prevDigit < currentDigit)
{
isRaising = false;
break;
}
}
currentDigit = prevDigit;
i = i % 10;
System.out.println("given num is" +num+ isRaising);
}
}
