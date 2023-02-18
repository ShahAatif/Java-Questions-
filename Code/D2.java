import java.util.Scanner;
class k21dp {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("----------Enter Student Detail-------------");
System.out.println("Enter name:- ");
String name=sc.nextLine();
System.out.println("Enter Roll no:- ");
int roll= sc.nextInt();
System.out.println("Enter Section:- ");
String section= sc.next();
System.out.println("Enter contact number:- ");
long contact= sc.nextLong();
System.out.println("Enter gender:- ");
char gender= sc.next().charAt(0);
System.out.println("Enter Fee:- ");
float fee= sc.nextFloat();
sc.close();
System.out.println("----------Student Detail----------");
System.out.println("Roll no of student is :- " + roll);
System.out.println("Name of student is :- " + name);
System.out.println(" Section of student :- " + section);
System.out.println("Contact number of student is :- " + contact);
System.out.println("Gender of student is :- " + gender);
System.out.println("Fee detail of student is :- " + fee);
String str="My name is Shruti";
Scanner sc1=new Scanner(str);
System.out.println("String contains value or not:- " +

sc1.hasNext());
System.out.println(sc1.nextLine());
sc1.close(); }}