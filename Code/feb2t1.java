class student{
String name;
int rollno;
static String uni="LPU";
student(String n,int r){
name=n;
rollno=r;}
void show(){
System.out.println(name +" ," + rollno + "," + "," + uni);}}
class k21dp{
public static void main(String args[]){
student s=new student("abc",34);
student s1=new student("djkjk",4);
student s2=new student("pqr",67);
student s3=new student("xyz",100);
s.show();
s1.show();
s2.show();
s3.show();
}
}