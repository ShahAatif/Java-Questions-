class employee 
{
final String pan;
employee()
{
pan="yyuji78";
System.out.println(pan);
}
void salary()
{
System.out.println("Salary of employee is :- 30000");
}
}
class appraisal extends employee
{
final String adhar;
appraisal()
{
adhar="2345678";
System.out.println(adhar);
}
void bonus()
{
System.out.println("Increment given to employee :- 8000");
}
}
class multiinheri extends appraisal
{
public static void main(String []args)
{
appraisal a=new appraisal();
a.salary();
a.bonus();
}
}
