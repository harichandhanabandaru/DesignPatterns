package Builder;

public class PaySlip {

    private String employeeName;
    private int employeeId;
    private double basicPay;
    private double hra;
    private double da;
    private double otherAllowances;
    private double grossSalary;
    private double pf;
    private double esi;
    private double tax;
    private double deductions;
    private double netSalary;

   public PaySlip( String employeeName,int employeeId,double basicPay,double hra,double da,double otherAllowances, double grossSalary,double pf,double esi,double tax,double deductions, double netSalary) {
       this.employeeName=employeeName;
       this.employeeId=employeeId;
       this.basicPay=basicPay;
       this.hra=hra;
       this.da=da;
       this.otherAllowances=otherAllowances;
       this.grossSalary=grossSalary;
       this.pf=pf;
       this.esi=esi;
       this.tax=tax;
       this.deductions=deductions;
       this.netSalary=netSalary;

   }



    public String toString()
    {
        return "Payslip details of \n "+" Employess Id "+employeeId +"\n  Name "+employeeName+"\n  basic pay "+basicPay+"\n  hra "+hra+"\n  da "+da+"\n  otherAllowances "+otherAllowances+"\n  gross Salary "+grossSalary+"\n  pf "+pf+"\n  esi "+esi+"\n  tax "+tax+
                "\n  deductions "+deductions+"\n  netsalary "+netSalary;
    }
}
