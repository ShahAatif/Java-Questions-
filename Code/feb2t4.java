class employee
{
String name;
int id;
employee(String name,int id)
{
this.name=name;
this.id=id;
}
void display()
{
System.out.println(name+","+id);
}
}
class k21dp
{
public static void main(String args[])
{
employee e=new employee("Gurvinder",0);
e.display();
}
}