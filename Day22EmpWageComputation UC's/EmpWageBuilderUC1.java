public class EmpWageBuilderUC1
{
public static void main(String[] args)
{
System.out.println("Wlecome to Employee");
int IsFullTime = 1;
double empCheck = Math.floor(Math.random() * 10) % 2;
if (empCheck == IsFullTime)
    System.out.println("Employee is present");
else
    System.out.println("Employee is Abscent");
}
}

