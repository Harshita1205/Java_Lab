class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    String getCoords(){
        return "(" + x + "," + y + ")";
    }
}

class Circle{
    double radius;
    Point center;
    public Circle(double radius, Point center){
        this.radius=radius;
        this.center=center;
    }
    double area(){
        return 3.14*radius*radius;
    }
    void display(){
        System.out.println("Circle details:\nRadius: " + radius +"\nCenter: " + center.getCoords()+ "\nArea: " + area());
    }
}

public class CirclePointDemo{
    public static void main(String [] args ){
        Point p1 = new Point(10,20);
        Circle c1 = new Circle(5.5, p1);
        c1.display();
    }
}