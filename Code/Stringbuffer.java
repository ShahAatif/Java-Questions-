import java.lang.StringBuffer;
class k21dp
{
public static void main(String aaatif[]){
StringBuffer sb= new StringBuffer("hello K21DP Students");
System.out.println(sb);
System.out.println(sb.capacity());
StringBuffer sb1= new StringBuffer();
System.out.println(sb1);
System.out.println(sb1.capacity());
System.out.println(sb.insert(1,"Java"));
System.out.println(sb.append("Programming"));
System.out.println(sb.delete(1,7));
System.out.println(sb.replace(6,10,"DATA"));
System.out.println(sb.reverse());
sb.ensureCapacity(40);
System.out.println(sb.capacity());
}
}
