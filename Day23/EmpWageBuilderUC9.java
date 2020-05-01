import java.lang.*;
//Creating class for Employee Wage calculation
//Object oriented apporach
//@author Aditi Pawar
public class EmpWageBuilderUC9
{
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private final String company;
   private final int wagePerHrs;
   private final int numWorkingDays;
   private final int maxHrsPerMonths;
   private int totalEmpWage;
   //constructor
   public EmpWageBuilderUC9(String company, int wagePerHrs, int numWorkingDays, int maxHrsPerMonths)
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
	   totalEmpWage = totalEmpHrs * wagePerHrs;
       //System.out.printf("Total salary:" +totalEmpWage);
       return totalEmpWage;
	}
   	@Override
	public String toString() {
		return "total Emp Wage for company:" +company+ "is:" +totalEmpWage;
	}

public static void main(String[] args)
{   // calculting employee wages for differnt company using object oriented methodology
    // creating object for Class
    EmpWageBuilderUC9 dmart = new EmpWageBuilderUC9("Dmart", 20, 2, 10);
    EmpWageBuilderUC9 bigBasket = new EmpWageBuilderUC9("BigBasket", 20, 3, 10);
    dmart.computeEmpWage();
	System.out.println(dmart);
	bigBasket.computeEmpWage();
	System.out.println(bigBasket);
}
}

