
import java.lang.*;
//create class for calculating Emp wage 
//using Array
//@author Aditi
public class EmpWageBuilderArray 
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
   }
   
   private void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int maxHrsPerMonths)
   {
	   companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, wagePerHrs, numWorkingDays, maxHrsPerMonths);
	   numOfCompany++;
   }

  private void computeEmpWage()
  {
	 for (int i = 0; i <numOfCompany; i++){
		 companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
	     System.out.println(companyEmpWageArray[i]);
  }
  }
   // Compute emp wage using Instance method
    private int computeEmpWage( CompanyEmpWage companyEmpWage)
    { 
	// Variable
      int totalWorkingDays = 0;
      int empHrs = 0;
      int totalEmpHrs = 0;
      while ( totalEmpHrs <= companyEmpWage.maxHrsPerMonths && totalWorkingDays < companyEmpWage.numWorkingDays )
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
	   //totalEmpWage = totalEmpHrs * wagePerHrs;
       //System.out.printf("Total salary:" +totalEmpWage);
       return totalEmpHrs * companyEmpWage.wagePerHrs;
	}
   
public static void main(String[] args)
  {   
    // calculting employee wages for differnt company using object oriented methodology
    // creating object for Class
    EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
    empWageBuilder.addCompanyEmpWage("dmart", 20, 2, 10);
	empWageBuilder.addCompanyEmpWage("Bigbasket", 20, 4, 20);
    empWageBuilder.computeEmpWage();
  }
}
