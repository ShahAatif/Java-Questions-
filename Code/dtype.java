class k21dp 
{
static void show(String name,int...a)
{
System.out.println(name);
for(int x:a)
{
System.out.println(x);
}
}
public static void main(String xyz[])
{
show("xyz");
show("xyz",45,79,90,12);
show("xyz",45,78,90,12,89,12,9,8,7,65,3);
}
}