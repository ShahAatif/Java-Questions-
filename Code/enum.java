class k21dpenum
{
public enum direction{North,South,East,West,NorthEast, NorthWest,SouthEast,SouthWest}
public static void main (String args[])
{
for(direction d:direction.values())
{
System.out.println(d);
}
System.out.println("The direction is :-" + direction.valueOf("North"));
System.out.println("The direction is not :-" + direction.valueOf("South"));
}
}