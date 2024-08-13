class P1{
public int a=test();
int c= 10;
static int b=20;
static{
System.out.println(b);
b=40;

{
System.out.println("hey");
}
public void m1()
{
System.out.println("m1");
}
public static int test()
{
System.out.println(b);
return 10;
}
public static void main(String[]args)
{
test();
}
}