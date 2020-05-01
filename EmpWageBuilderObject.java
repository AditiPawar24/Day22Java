// Employee Wge Computation class
// object oriented approach for one company
// @author Aditi Pawar

public class EmpWageBuilderObject
{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;
   
   private final String company;
   private final int wagePerHrs;
   private final int numWorkingDays;
   private final int maxHrsPerMonths;

   //constructor
   public EmpWageBuilderObject(String company, int wagePerHrs, int numWorkingDays, int maxHrsPerMonths)
   {
     this.company = company;
     this.wagePerHrs = wagePerHrs;
     this.numWorkingDays = numWorkingDays;
     this.maxHrsPerMonths = maxHrsPerMonths;
    }
   // Main method 
   public static void main(String[] args)
   {
	 //object creation
     EmpWageBuilderObject dmart = new EmpWageBuilderObject("Dmart", 20, 2, 10);
    int totalWorkingDays = 0;
    int empHrs = 0;
    int totalEmpHrs = 0;

      while ( totalEmpHrs <= dmart.maxHrsPerMonths && totalWorkingDays < dmart.numWorkingDays )
      {
        totalWorkingDays++;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        switch (empCheck) {
        //variable empHrs shows employee working hours i.e employee is full time or part time
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
     System.out.println("Day:" +totalWorkingDays + "Emp Hrs:" +empHrs);
   }

    int totalEmpWage = totalEmpHrs * dmart.wagePerHrs;
    System.out.printf("Total Emp Wage for company:" +dmart.company +"is:" +totalEmpWage);
}
}

