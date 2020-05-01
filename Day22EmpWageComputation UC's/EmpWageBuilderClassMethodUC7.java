public class EmpWageBuilderClassMethodUC7
{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   public static final int wagePerHrs = 20;
   public static final int numWorkingDays = 2;
   public static final int maxHrsInMonths = 10;
  // Compute emp wage using class method
   public static int computeEmpWage()
   {

      int totalWorkingDays = 0;
      int empHrs = 0;
      int totalEmpHrs = 0;
      while ( totalEmpHrs <= maxHrsInMonths && totalWorkingDays < numWorkingDays )
       {
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
       return totalEmpWage;
    }

public static void main(String[] args)
{
    computeEmpWage();
}
}

