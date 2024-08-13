class P2{

static int a= demo()+test();;
static String var1;
static
{

System.out.println("smli");
demo();
}
public static void main(String[]args)
{
System.out.println("start of the main");
var1="ram";
demo();
System.out.println(a);
System.out.println("ends of the main");
}
public static int demo()
{
System.out.println(var1);
return 5;
}
public static int test()
{
System.out.println("i am test");
return 3;
}
static
{
System.out.println("smil");
a=1;
}

}