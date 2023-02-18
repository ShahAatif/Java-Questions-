class K21dparray
{
static void max(int arr[])
{
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(max<arr[i])
{
max=arr[i];
}
}
System.out.println(max);
}
public static void main(String sh[])
{
int a[]={34,78,12,98,28,40,57,1,8,68};
max(a);//passing argument as an array
}
}
