class typecasting
{
public static void main (String args[])
{
int i=78;
long l=i;//implicit
System.out.println(l);
float f=l; //implicit
System.out.println(f);
double d=f; //implicit
System.out.println(d);
double dt=295.04;
byte b=(byte) dt; //explicit, byte will truncate floating value.
System.out.println(b);
int it=790;
byte bi=(byte) it; // explicit
System.out.println(bi);
long lg = 2456;
byte bil=(byte) lg; //explicit
System.out.println(bil);
int xby=-482;
byte bit=(byte) xby;
System.out.println(bit);
int xbz=-996;
byte lgs=(byte) xbz;
System.out.println(lgs);
byte b1=65;
char c=(char)b1;
System.out.println(c);
char c1=(char)65.1;
System.out.println(c1);
}}