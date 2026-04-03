interface Exam {
    void percent_cal();
}
class Student {
    String name;
    int rollno;
    int marks1, marks2;

    Student(String n, int r, int m1, int m2) {
        name = n;
        rollno = r;
        marks1 = m1;
        marks2 = m2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
    }
}
class Result extends Student implements Exam {
    double per;

    Result(String n, int r, int m1, int m2) {
        super(n, r, m1, m2);
    }

    public void percent_cal() {
        per = (marks1 + marks2) / 2.0;
    }

    void display() {
        show();
        System.out.println("Percentage: " + per);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Result r = new Result("Harshita", 101, 80, 90);
        r.percent_cal();
        r.display();
    }
}