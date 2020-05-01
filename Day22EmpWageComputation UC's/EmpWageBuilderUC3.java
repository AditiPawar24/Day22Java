public class EmpWageBuilderUC3
{
public static void main(String[] args)
{
int WagePerHrs = 20;
int DailyEmpWage = 0;
int IsFullTime = 1;
int IsPartTime = 2;
int empHrs = 0;
double empCheck = Math.floor(Math.random() * 10) % 2;

if (empCheck == IsFullTime)
{
    empHrs = 8;
    System.out.println("Full Time hrs:" +empHrs);
}
else if (empCheck == IsPartTime)
{
    empHrs = 8;
    System.out.println("Part Time hrs:" +empHrs);
}
else
{
    empHrs = 0;
    System.out.println("Part Time hrs:" +empHrs);
}

DailyEmpWage = WagePerHrs * empHrs;
System.out.println("DailyEmpWages is :" +DailyEmpWage);
}
}
