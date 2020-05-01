public class EmpWageBuilderUC2
{
public static void main(String[] args)
{
int WagePerHrs = 20;
int FullDayHrs = 8;
int DailyEmpWage = 0;
int IsFullTime = 1;
double empCheck = Math.floor(Math.random() * 10) % 2;

if (empCheck == IsFullTime)
{
    DailyEmpWage = WagePerHrs * FullDayHrs;
    System.out.println("DailyEmpWage is :" +DailyEmpWage);
    System.out.println("Employee is present");
}
else
{
    DailyEmpWage = 0;
    System.out.println("DailyEmpWage is :" +DailyEmpWage);
    System.out.println("Employee is Abscent");
}
}
}
