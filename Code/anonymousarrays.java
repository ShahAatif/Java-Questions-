//Anonymous Arrays
class Anonymous
{
static void printarray(int arr[])
{
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
public static void main(String sh[])
{

printarray(new int[]
{34,67,89,12,34,90,4,5,6,7,8});
}
}