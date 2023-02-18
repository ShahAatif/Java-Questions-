class demo
{
demo ()
{
System.out.println("I m display method");
}
demo(int x)
{
this();
System.out.println(x);
}
demo(int x,int y)
{
this(x);
System.out.println(x+","+y);
}
}
class thismethoddemo
{
public static void main(String args[])
{
demo d=new demo(67,89);

}
}