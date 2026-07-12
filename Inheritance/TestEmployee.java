public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Soumya",
                500000,
                2026,
                "NI123456");

        System.out.println("Employee Name : "
                + emp.getName());

        System.out.println("Annual Salary : "
                + emp.getAnnualSalary());

        System.out.println("Year Started  : "
                + emp.getYearStarted());

        System.out.println("Insurance No. : "
                + emp.getNationalInsuranceNumber());
    }
}