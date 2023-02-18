class SingletonClass
{
private static SingletonClass instance=null;
public String str;
private SingletonClass()
{}
public static SingletonClass getInstance()
{
if(instance==null)
{
instance=new SingletonClass();
}
return instance;
}
public static void main(String args[])
{
SingletonClass single=SingletonClass.getInstance();
single.str="My name is xyz";
System.out.println(single.str);
SingletonClass s=SingletonClass.getInstance();
s.str="K21DP students";
System.out.println(s.str);
}
}