class demo
{
void display()
{
System.out.println("I am display method");
}
void show()
{
this.display();
System.out.println(" I am show method");
}}
class k21dp
{
public static void main(String t[]){
demo d=new demo();
d.show();
}}