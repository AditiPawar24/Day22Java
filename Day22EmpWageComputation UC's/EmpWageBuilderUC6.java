public class EmpWageBuilderUC6
{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int wagePerHrs = 20;
   public static final int numWorkingDays = 2;
   public static final int maxHrsInMonths = 10;


   public static void main(String[] args)
 {

   int totalWorkingDays = 0;
   int empHrs = 0;
   int totalEmpHrs = 0;

   while ( totalEmpHrs <= maxHrsInMonths && totalWorkingDays < numWorkingDays )
   {
     totalWorkingDays++;
    int empCheck = (int) Math.floor(Math.random() * 10) % 2;
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
    totalEmpHrs += empHrs;
     System.out.println("Day:" +totalWorkingDays + "Emp Hrs" +empHrs);
}

  int totalEmpWage = totalEmpHrs * wagePerHrs;
    System.out.printf("Total salary:" +totalEmpWage);
}
}

