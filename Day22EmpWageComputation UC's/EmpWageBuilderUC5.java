public class EmpWageBuilderUC5
{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   public static void main(String[] args)
 {
   int WagePerHrs = 20;
   int totalSalary = 0;
   int numWorkingDays = 20;
   int empHrs = 0;
   int DailyEmpWage = 0;
   int day;
   for(day=1; day<=numWorkingDays; day++)
   {
    int empCheck = (int)Math.floor(Math.random() * 10) % 2;
      switch (empCheck) {

      case IS_FULL_TIME:
          empHrs=8;
      break;

      case IS_PART_TIME:
         empHrs=4;
      break;
      default:
      empHrs=0;
    }
    DailyEmpWage = empHrs * WagePerHrs;
    System.out.println(+DailyEmpWage);
    totalSalary = totalSalary + DailyEmpWage;
   }
    System.out.println("Total salary:" +totalSalary);
}
}
