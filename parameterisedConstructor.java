class Student{
    int rollno;
    String name;

    Student(String n, int r){
        name = n;
        rollno = r;
    }

    void display(){
        System.out.println("Name:" + name);
        System.out.println("Roll no:" + rollno);
    }

    public static void main(String[] args){
        Student a1 = new Student("Bhumika",4047);
        a1.display();
    }

}