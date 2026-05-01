interface Exam {
    void calculatePercentage();
}

class Student {
    private String name;
    private int rollno;
    protected double m1, m2;

    Student(String n, int rn, double m1, double m2) {
        this.name = n;
        this.rollno = rn;
        this.m1 = m1;
        this.m2 = m2;
    }

    void show() {
        System.out.println("\n---------STUDENT DETAILS---------");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks1: " + m1);
        System.out.println("Marks2: " + m2);
    }
}

class Result extends Student implements Exam {
    double per;
    int nos;

    Result(String n, int rn, double m1, double m2, int nos) {
        super(n, rn, m1, m2);
        this.nos=nos;
    }

    public void calculatePercentage() {
        per = (m1 + m2) / 2;
    }

    void display() {
        show();
        System.out.println("Number of Subjects: " + nos);
        System.out.println("Percentage: " + per);
    }
}

class Demo2 {
    public static void main(String[] args) {
        Result s1 = new Result("Bhumika Sasmal", 4047, 89, 95,2);
        s1.calculatePercentage();
        s1.display();
    }
}
