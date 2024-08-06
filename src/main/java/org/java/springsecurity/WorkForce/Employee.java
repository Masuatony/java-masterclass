package org.java.springsecurity.WorkForce;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "1990-01-01", "2022-01-01");
        Employee employee2 = new Employee("Jane Smith", "1985-12-31", "2021-06-15");

        System.out.println(employee1);
        System.out.println(employee2);

        String textBlock = """
                \u2024 First Name\s
                  John Doe
                        \u2022 Last Name""";
        System.out.println(textBlock);

        int age  = 26;
        int yearsToRetirement = 2024 - age;
        System.out.printf("age = %d years\n yearsOfBirth = %d", age, yearsToRetirement);

    }
}
