import java.lang.*;
//Creating class for Employee Wage calculation
//Interface approch
//@author Aditi Pawar
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
	
