import java.util.Scanner;
class student;++++++++++++++++++++----------------
{
void detail()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter name:");
String name=sc.nextLine();
System.out.println("Enter Marks : ");
int marks=sc.nextInt();
if(marks>=60)
{
System.out.println("You are not eligible");
return false;
}
}
void showdata()
{
System.out.println("Name of student:- " +name);
}
}
class feb1t2
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
System.out.println("How many record you want to enter");
int n=s1.nextInt();
student s[]=new student[n]; //Array Object
for(int i=0;i<s.length;i++)
{
s[i]=new student());
s[i].getdata();
if(s[i].eligible())
{
s[i].showdata();
=5--

}
}	