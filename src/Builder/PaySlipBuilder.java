package Builder;

public class PaySlipBuilder {

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


    public PaySlipBuilder setEmployeeName(String employeeName)
    {
        this.employeeName=employeeName;
                return this;
    }
    public PaySlipBuilder setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
        return this;
    }

    public PaySlipBuilder setBasicPay(double basicPay)
    {
        this.basicPay=basicPay;
        return this;
    }

    public PaySlipBuilder setHra(double hra)
    {
        this.hra=hra;
        return this;
    }
    public PaySlipBuilder setDa(double da)
    {
        this.da=da;
        return this;
    }

    public PaySlipBuilder setOtherAllowances(double otherAllowances)
    {
        this.otherAllowances=otherAllowances;
        return this;
    }

    public PaySlipBuilder setGrossSalary(double grossSalary)
    {
        this.grossSalary=grossSalary;
        return this;
    }
    public PaySlipBuilder setPf(double pf)
    {
        this.pf=pf;
        return this;
    }
    public PaySlipBuilder setEsi(double esi)
    {
        this.esi=esi;
        return this;
    }

    public PaySlipBuilder setTax(double tax)
    {
        this.tax=tax;
        return this;
    }
    public PaySlipBuilder setDeductions(double deductions)
    {
        this.deductions=deductions;
        return this;
    }

    public PaySlipBuilder setNetSalary(double netSalary)
    {
        this.netSalary=netSalary;
        return this;
    }

    public PaySlip getPaySlip()
    {
        return new PaySlip(employeeName,employeeId, basicPay, hra, da, otherAllowances, grossSalary, pf, esi, tax, deductions, netSalary);
    }

}
