class StudentOne{
    int rollno;
    String name;

    StudentOne(String n, int r){
        this.name = n;
        this.rollno = r;
    }
    StudentOne(String n){
        this.name = n;
        this.rollno = 0000;
    }
    StudentOne(int r){
        this.name = "unknown";
        this.rollno = r;
    }

    void display(){
        System.out.println("Name:" + this.name);
        System.out.println("Roll no:" + this.rollno);
    }

    public static void main(String[] args){
        StudentOne a2 = new StudentOne("mahul");
        a2.display();
        StudentOne a3 = new StudentOne(4008);
        a3.display();
        StudentOne a1 = new StudentOne("Bhumika",4047);
        a1.display();
    }

}