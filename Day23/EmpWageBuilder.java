import java.lang.*;
import java.util.*;
//create class for calculating Emp wage 
//@author Aditi

public interface IComputeEmpWage {
	 public void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int maxHrsPerMonths);
    public void computeEmpWage();
	public int getTotalWage(String company);
	
}

public class CompanyEmpWage
{
   private final String company;
   private final int wagePerHrs;
   private final int numWorkingDays;
   private final int maxHrsPerMonths;
   private int totalEmpWage;
   //constructor
   public CompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int maxHrsPerMonths)
   {
     this.company = company;
     this.wagePerHrs = wagePerHrs;
     this.numWorkingDays = numWorkingDays;
     this.maxHrsPerMonths = maxHrsPerMonths;
	 totalEmpWage = 0;
    }
	//setter
	public void setTotalEmpWage(int totalEmpWage ){
		this.totalEmpWage = totalEmpWage;
	}
		@Override
	public String toString() {
		return "total Emp Wage for company:" +company+ "is:" +totalEmpWage;
	}
}
	
public class EmpWageBuilde implements IComputeEmpWage 
{
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	
	public EmpWageBuilder() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
   }
   
   public void addCompanyEmpWage(String company, int wagePerHrs, int numWorkingDays, int maxHrsPerMonths)
   {
	   CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHrs, numWorkingDays, maxHrsPerMonths);
	   companyEmpWageList.add(companyEmpWage);
	   companyToEmpWage.put(company, companyEmpWage);
   }

  private void computeEmpWage()
  {
	 for (int i = 0; i < companyEmpWageList.size(); i++){
		 CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
		 companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
	     System.out.println(companyEmpWage);
  }
  }
  
  @Override 
  public int getTotalWage(String company) {
	retrun companyToEmpWageMap.get(company).totalEmpWage;
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
}   
public static void main(String[] args)
  {   
    // calculting employee wages for differnt company using object oriented methodology
    // creating object for Class
    IComputeEmpWage empWageBuilder = new EmpWageBuilder();
    empWageBuilder.addCompanyEmpWage("dmart", 20, 2, 10);
	empWageBuilder.addCompanyEmpWage("Bigbasket", 20, 4, 20);
    empWageBuilder.computeEmpWage();
	System.out.println("total wage for Dmart:" +empWageBuilder.getTotalWage("dmart"));
  }
}
