import java.util.Scanner;
class student;
{
void detail()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter name:");
String name=sc.nextLine();
System.out.println("Enter Roll no. : ");
int roll=sc.nextInt();
System.out.println("Enter Gender:");
char gen=sc.next().charAt(0);
System.out.println("Enter contact number:");
long contact=sc.nextLong();
System.out.println("Enter DOB");
String dob=sc.next();
System.out.println("Enter Age");
byte age=sc.nextByte();
System.out.println("----------Details of Student----------");
System.out.println("Name of Student is:-" + name);
System.out.println("Roll no. of Student is:-" + roll);
System.out.println("Gender of Student is:-" + gen);
System.out.println("DOB of Student is:-" + dob);
System.out.println("Age of Student is:-" + age);}}
class feb1{
public static void main(string args[]){
student s=new student();
}
}
