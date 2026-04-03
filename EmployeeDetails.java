interface Gross {
    void calc();
}

class Employee {
    String name;
    int id;
    double basic;

    Employee(String n, int i, double b) {
        name = n;
        id = i;
        basic = b;
    }
}

class Salary extends Employee implements Gross {
    Salary(String n, int i, double b) {
        super(n, i, b);
    }

    public void calc() {
        double gross = basic + 0.2 * basic + 0.1 * basic;
        System.out.println(name + " " + id + " Gross: " + gross);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Salary s = new Salary("Harshita", 101, 10000);
        s.calc();
    }
}