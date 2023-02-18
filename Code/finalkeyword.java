final class k21dp
{
void show(){
System.out.println("i am final method");
}}
class k21dpdemo extends k21dp{
void show()
{
System.out.println("I am not final method");
}
public static void main (String tk[])
{
k21dpdemo obj=new k21dpdemo();
obj.show();
}
}