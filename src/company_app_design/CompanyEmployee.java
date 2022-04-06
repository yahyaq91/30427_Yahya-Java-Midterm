package company_app_design;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */
    public static void main(String[] args) {

        EmployeeInfo e1 = new EmployeeInfo("Yahya", 1, "CEO", "yahya@company.com", "Director", 900_000);

        System.out.println("Emp ID: " + e1.employeeId());

        System.out.println("Emp Dept:" + e1.getDepartment());

        System.out.println("Emp email: " + e1.getEmail());

        System.out.println("Emp Salary: " + e1.calculateSalary());


        e1.assignDepartment("Marketing");

        System.out.println("new department: " + e1.getDepartment());

        System.out.println("Num of employees: " + e1.getNumOfEmployees());
        System.out.println();
        e1.isFullTime(false);
        System.out.println("Benefits for part time employees: ");
        e1.benefits();
        System.out.println();
        e1.isFullTime(true);
        System.out.println("Benefits for full-time employees: ");
        e1.benefits();
        System.out.println();
        e1.printSlogan();

    }

}
