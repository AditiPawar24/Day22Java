public class EmpWageBuilderClassMethodUC8
{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private final String company;
   private final int wagePerHrs;
   private final int numWorkingDays;
   private final int maxHrsPerMonths;

   //constructor
   public EmpWageBuilderClassMethodUC8(String company, int wagePerHrs, int numWorkingDays, int maxHrsPerMonths)
   {
     this.company = company;
     this.wagePerHrs = wagePerHrs;
     this.numWorkingDays = numWorkingDays;
     this.maxHrsPerMonths = maxHrsPerMonths;
    }
   // Compute emp wage using Instance method
    public int computeEmpWage()
   {

      int totalWorkingDays = 0;
      int empHrs = 0;
      int totalEmpHrs = 0;
      while ( totalEmpHrs <= maxHrsPerMonths && totalWorkingDays < numWorkingDays )
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
    EmpWageBuilderClassMethodUC8 dmart = new EmpWageBuilderClassMethodUC8("Dmart", 20, 2, 10);
    EmpWageBuilderClassMethodUC8 bigBasket = new EmpWageBuilderClassMethodUC8("BigBasket", 20, 3, 10);
    System.out.println("Total Emp wage for company:" +dmart.company + " is: " +dmart.computeEmpWage());
    System.out.println("Total Emp wage for company:" +bigBasket.company + " is: " +bigBasket.computeEmpWage());
}
}

