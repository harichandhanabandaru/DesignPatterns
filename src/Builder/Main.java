package Builder;

public class Main {
    public static void main(String[] args)
    {
        PaySlip p= new PaySlipBuilder()
                .setEmployeeId(1)
                .setEmployeeName("Anitha")
                .setBasicPay(50000)
                .setHra(15000)
                .setDa(10000)
                .setOtherAllowances(5000)
                .setPf(6000)
                .setEsi(3000)
                .setTax(10000)
                .getPaySlip();
        System.out.println(p);
    }
}
