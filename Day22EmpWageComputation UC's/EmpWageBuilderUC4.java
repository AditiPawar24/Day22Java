public class EmpWageBuilderUC4
{
  public static final int WagePerHrs = 20;
  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;

  public static void main(String[] args)
  {

    int empHrs = 0;
    int dailyEmpWage = 0;
    int empCheck = (int)Math.floor(Math.random() * 10) % 2;
    switch (empCheck) {
    case IS_FULL_TIME:
          empHrs = 8;
          System.out.println("Full Time hrs:" +empHrs);
    break;

    case IS_PART_TIME:
           empHrs = 8;
           System.out.println("Part Time hrs:" +empHrs);
    break;
    default:
            empHrs = 0;
           System.out.println("Part Time hrs:" +empHrs);
}

dailyEmpWage = WagePerHrs * empHrs;
System.out.println("DailyEmpWages is :" +dailyEmpWage);
}
}

